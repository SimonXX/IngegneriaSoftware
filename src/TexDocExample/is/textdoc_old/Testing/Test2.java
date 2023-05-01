package TexDocExample.is.textdoc_old.Testing;

import TexDocExample.is.textdoc_old.TextDocument;
import TexDocExample.is.textdoc_old.builder.DocumentBuilder;
import TexDocExample.is.textdoc_old.builder.TextDocumentBuilder;
import TexDocExample.is.textdoc_old.html.HTMLTextBuilder;
import TexDocExample.is.textdoc_old.json.JsonTextBuilder;
import TexDocExample.is.textdoc_old.latex.LaTeXTextBuilder;
import TexDocExample.is.textdoc_old.parser.TextDocumetParser;

import java.io.File;
import java.io.PrintWriter;

public class Test2 {

    public static void main(String[] args) throws Exception {


        //CONVERSIONE IN HTML
        File f = new File("output.html");

        PrintWriter pw = new PrintWriter(f);

        DocumentBuilder builder = new HTMLTextBuilder(pw);

        TextDocumetParser tp = new TextDocumetParser(builder, new File(args[0]).toURI().toURL().toString());
        tp.build(); //nel file output.html stiamo scrivendo il documento in HTML


        //CONVERSIONE IN LATEX
        f = new File("output.tex");

        pw = new PrintWriter(f);

        builder = new LaTeXTextBuilder(pw);

        tp = new TextDocumetParser(builder, new File(args[0]).toURI().toURL().toString());

        tp.build();


        //CONVERSIONE IN JSON
        f = new File("output.json");

        pw = new PrintWriter(f);

        builder = new JsonTextBuilder(pw);

        tp = new TextDocumetParser(builder, new File(args[0]).toURI().toURL().toString());

        tp.build();


        //ricostruisce l'oggetto TextDocument

        TextDocumentBuilder builder2 = new TextDocumentBuilder();
        tp = new TextDocumetParser(builder2, new File(args[0]).toURI().toURL().toString());
        tp.build();
        TextDocument doc = builder2.getDocument();



    }
}
