package TextDocExample.is.textdoc.TestPersonali;

import TextDocExample.is.textdoc.TextDocument;
import TextDocExample.is.textdoc.builder.TextDocumentBuilder;
import TextDocExample.is.textdoc.parser.TextDocumentParser;
import TextDocExample.is.textdoc.visitor.StatsVisitor;
import TextDocExample.is.textdoc.visitor.TextDocumentVisitor;

import java.io.File;

public class TestStatsVisitor {


    public static void main(String[] args) throws Exception {
        TextDocumentVisitor visitor = new StatsVisitor();


        TextDocumentBuilder builder = new TextDocumentBuilder();
        File f = new File("prova.dat");

        TextDocumentParser tp = new TextDocumentParser(builder, f.toURI().toURL().toString());

        tp.build();

        TextDocument doc = builder.getDocument();

        doc.accept(visitor);

    }


}
