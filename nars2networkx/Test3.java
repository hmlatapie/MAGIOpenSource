/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
***/
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import org.python.util.PythonInterpreter;
import org.python.core.*;
public class Test3 {
    public static void main(String[] args) throws Exception {
        String inputFile = null; 
        if ( args.length>0 ) inputFile = args[0];
        InputStream is = System.in;
        if ( inputFile!=null ) is = new FileInputStream(inputFile);
        ANTLRInputStream input = new ANTLRInputStream(is); 
        NarseseLexer lexer = new NarseseLexer(input); 
        CommonTokenStream tokens = new CommonTokenStream(lexer); 
        NarseseParser parser = new NarseseParser(tokens); 
        ParseTree tree = parser.narsese(); // parse; start at prog <label id="code.tour.main.6"/>
//System.out.println(tree.toStringTree(parser)); // print tree as text <label id="code.tour.main.7"/>

        String treeReport = tree.toStringTree(parser); 
	try {
		Files.write(Paths.get("treeOutput.txt"), treeReport.getBytes(StandardCharsets.UTF_8));
	} catch (IOException e) {
		e.printStackTrace();
	}

        PythonInterpreter interp = new PythonInterpreter();
        System.out.println("Hello, brave new world");
        interp.exec("import sys");
	interp.exec("import networkx as nx");
	interp.exec("g = nx.Graph()");
	interp.exec("g.add_node(1)");
	interp.exec("nx.write_graphml(g,\"test.graphml\")");
    }
}
