#!/usr/bin/python3
import sys
from antlr4 import *
import antlr4 as antlr
try:
    from gen.NarseseLexer import NarseseLexer
    from gen.NarseseParser import NarseseParser
    from gen.NarseseListener import NarseseListener
except ModuleNotFoundError:
    from .gen.NarseseLexer import NarseseLexer
    from .gen.NarseseParser import NarseseParser
    from .gen.NarseseListener import NarseseListener
import networkx as nx
from typing import Iterable

class nars2networkx(NarseseListener):
## Add Nodes
# If the node already exists, nx merges the attributes with an overwrite policy
## Add edge Relation
# Every Narsese copula means a specific relation and has a (frequency, confidence) pair
# If the edge already exists, nx merges the attributes with an overwrite prolicy

    def __init__(self,g):
        self.g = g 
        self.g.mode = 'pickle' 
        self.relationCount = 1

    def exitStatement1(self, ctx:NarseseParser.Statement1Context):
        node1 = '{'+ctx.WORD().getText()+'}'
        node2 = ctx.coreterm().getText()
        self.g.add_node(node1, src="nars")
        relation = ctx.COPULA().getText()
        if self.g.mode == 'pickle':
            if ctx.freqConf() is None:
                DFREDict = {
                    "DFREPropertyType" : relation,
                    "DFREPropertyValue" : node2,
                }
            else:
                DFREDict = {
                    "DFREPropertyType" : relation,
                    "DFREPropertyValue" : node2,
                    "DFREFreq" : ctx.freqConf().FLOAT(0).getText(),
                    "DFREConf" : ctx.freqConf().FLOAT(1).getText()
                }
            if "DFREProperties" not in self.g.nodes[node1]:
                self.g.nodes[node1]["DFREProperties"] = list()
            self.g.nodes[node1]["DFREProperties"].append( DFREDict)
        else:
            if ctx.freqConf() is None:
                self.g.nodes[node1]["DFREPropertyType"] = relation
                self.g.nodes[node1]["DFREPropertyValue"] = node2
            else:
                self.g.nodes[node1]["DFREPropertyType"] = relation
                self.g.nodes[node1]["DFREPropertyValue"] = node2
                self.g.nodes[node1]["DFREFreq"] = ctx.freqConf().FLOAT(0).getText()
                self.g.nodes[node1]["DFREConf"] = ctx.freqConf().FLOAT(1).getText()

        self.g.add_node(node2, src="nars")
        self.postProcessSentence(ctx, relation, node1, node2)

    def exitStatement1b(self, ctx:NarseseParser.Statement1bContext):
        node1 = ctx.coreterm(0).getText()
        node2 = ctx.coreterm(1).getText()
        relation = ctx.coreterm(2).getText()
        self.g.add_node(node1, src="nars")
        self.g.add_node(node2, src="nars")
        self.postProcessSentence(ctx, relation, node1, node2)

    def exitStatement2(self, ctx:NarseseParser.Statement2Context):
        node1 = ctx.statement(0).getText()
        self.g.add_node(node1, src="nars")
        relation = ctx.COPULA().getText()
        node2 = ctx.statement(1).getText()
        self.g.add_node(node2, src="nars")
        self.postProcessSentence(ctx, relation, node1, node2)

    def exitStatement3(self, ctx:NarseseParser.Statement3Context):
        pass

    def exitStatement4(self, ctx:NarseseParser.Statement4Context):
        pass

    def exitStatement5(self, ctx:NarseseParser.Statement5Context):
        node1 = ctx.statement(0).getText()
        self.g.add_node(node1, src="nars")
        relation = ctx.COPULA().getText()
        node2 = ctx.statement(1).getText()
        self.g.add_node(node2, src="nars")
        self.g.add_edge(node1,node2, src="nars")
        self.g[node1][node2]['relation'] = relation

    def postProcessSentence(self, ctx, relation, node1, node2):
        self.g.add_edge(node1,node2, src="nars")
        stype = ctx.SentenceType()
        if not stype  == None:
            stype = stype.getText()
            relationid = relation + stype
            self.g[node1][node2][relationid + "SentenceType"] = stype
            if not ctx.freqConf() is None:
                freq = ctx.freqConf().FLOAT(0).getText()
                conf = ctx.freqConf().FLOAT(1).getText()
                self.g[node1][node2][relationid + "freq"] = freq
                self.g[node1][node2][relationid + "conf"] = conf
            NarsLogEntryPrefix = ctx.NarsLogEntryPrefix().getText()
            self.g[node1][node2][relationid + "NarsLogEntryPrefix"] = NarsLogEntryPrefix


def from_sstream(sstream: str, translator: nars2networkx) -> None:
    ## Create lexer and tokenize input
    # print("Create lexer for...")
    # print(sstream)
    lexer = NarseseLexer(antlr.InputStream(sstream))
    # print("Tokenize...")
    token_stream = antlr.CommonTokenStream(lexer)
    ## Create parser and build AST
    # print("Create parser...")
    parser = NarseseParser(token_stream)
    parser._interp.predictionMode = antlr.PredictionMode.SLL
    # print("Parse...")
    tree = parser.narsese()
    ## Create Tree walker and inject the translator over a networkx graph
    walker = antlr.ParseTreeWalker()
    ## Roll
    # print("Walk tree...")
    walker.walk(translator, tree)


def main(argv):
    input_stream = FileStream(argv[1])
    lexer = NarseseLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = NarseseParser(stream)
    parser._interp.predictionMode = PredictionMode.SLL
    tree = parser.narsese()
    g = nx.Graph()
    printer = nars2networkx(g)
    walker = ParseTreeWalker()
    walker.walk(printer,tree)
    #nx.write_graphml_lxml(g,"test.graphml")

if __name__ == '__main__':
    main(sys.argv)

