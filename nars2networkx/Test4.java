import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.atn.*;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import org.python.util.PythonInterpreter;
import org.python.core.*;

public class Test4 {
    public static void main(String[] args) throws Exception {
        String inputFile = null; 
        if ( args.length>0 ) inputFile = args[0];
        InputStream is = System.in;
        if ( inputFile!=null ) is = new FileInputStream(inputFile);
        ANTLRInputStream input = new ANTLRInputStream(is); 
        NarseseLexer lexer = new NarseseLexer(input); 
        CommonTokenStream tokens = new CommonTokenStream(lexer); 
        NarseseParser parser = new NarseseParser(tokens); 
        ParseTree tree; 

        PythonInterpreter interp = new PythonInterpreter();
        System.out.println("Hello, brave new world");
        interp.exec("import sys");
	interp.exec("import networkx as nx");
	interp.exec("g = nx.Graph()");
	interp.exec("g = nx.Graph()");
	int nodes = 5000;
	for(int i=0;i<nodes;++i)
	{
	   interp.exec("g.add_node(" + i + ")");
	}
	interp.exec("nx.write_graphml(g,\"test.graphml\")");
        int runs=100;
	for(int i=0; i< runs; ++i)
	{
           is = new FileInputStream(inputFile);
           input = new ANTLRInputStream(is); 
           lexer = new NarseseLexer(input); 
           tokens = new CommonTokenStream(lexer); 
           parser = new NarseseParser(tokens); 
	   parser.getInterpreter().setPredictionMode(PredictionMode.SLL);
           tree = parser.narsese(); // parse; start at prog <label id="code.tour.main.6"/>
           //System.out.println(tree.toStringTree(parser)); // print tree as text <label id="code.tour.main.7"/>
           String treeReport = tree.toStringTree(parser); 
	   try {
		Files.write(Paths.get("treeOutput.txt"), treeReport.getBytes(StandardCharsets.UTF_8));
	   } catch (IOException e) {
		e.printStackTrace();
	   }
	}
	System.out.println("runs: " + runs + " nodes: " + nodes);
    }
}
