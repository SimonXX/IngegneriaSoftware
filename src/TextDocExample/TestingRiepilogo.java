package TextDocExample;

import TexDocExample.is.textdoc_old.parser.TextDocumetParser;
import TextDocExample.is.textdoc.TextDocument;
import TextDocExample.is.textdoc.builder.DocumentBuilder;
import TextDocExample.is.textdoc.builder.TextDocumentBuilder;
import TextDocExample.is.textdoc.html.HTMLTextBuilder;
import TextDocExample.is.textdoc.parser.TextDocumentParser;
import TextDocExample.is.textdoc.visitor.DirectorVisitor;
import TextDocExample.is.textdoc.visitor.NativeTextVisitor;
import TextDocExample.is.textdoc.visitor.RemoveSubSectionVisitor;
import TextDocExample.is.textdoc.visitor.TextDocumentVisitor;

import java.io.File;
import java.io.PrintWriter;

public class TestingRiepilogo {

    public static void main(String[] args) throws Exception{

        if (args.length == 0) {
            System.err.println("usage java Test inputFile [native|txt|html|latex|json|nosub]");
            System.exit(1);
        }

        File f = new File(args[0]);
        if (!f.isFile()) {
            System.err.println(args[0] + " not found!");
            System.exit(1);
        }


        //PRIMA PARTE

        PrintWriter pw = new PrintWriter(System.out);
        DocumentBuilder builder = new HTMLTextBuilder(pw);


        TextDocumentParser tp = new TextDocumentParser(builder, new File(args[0]).toURI().toURL().toString());
        tp.build();//ci limitiamo ad usare unicamente il pattern builder -> stampiamo a video il documento tradotto in html preso dalla memoria secondaria


        //SECONDA PARTE
        //adesso abbiamo sfruttato il pattern Composite aiutati dalla classe TextDocumetBuilder al fine di avere un documento struttura in memoria centrale
        PrintWriter pw2 = new PrintWriter("output testingRiepilogo");

        TextDocumentBuilder builder2 = new TextDocumentBuilder();
        TextDocumentParser tp2 = new TextDocumentParser(builder2, new File(args[0]).toURI().toURL().toString());
        tp2.build();

        TextDocument doc = builder2.getDocument();

        //TERZA PARTE
        //adesso usiamo il pattern visitor
        //rimuoviamo le sottosezioni
        TextDocumentVisitor visitor = new RemoveSubSectionVisitor();
        doc.accept(visitor); //il nostro documento in memoria centrale deve accettare il visitor
        //vogliamo adesso stampare il nostro documento modificato in memoria centrale -> usiamo un altro visitor
        visitor = new NativeTextVisitor(pw2);
        doc.accept(visitor);

        //QUARTA PARTE

        //sempre usando il visitor vogliamo passare dalla rappresentazione in memoria principale, direttamente a quella in memoria secondaria -> sfruttando un builder qualsiasi
        PrintWriter pw3 = new PrintWriter("output testingRiepilogo2");

        visitor = new DirectorVisitor(new HTMLTextBuilder(pw3));//passiamo dalla rappresentazione in memoria alla rappresentazione in html direttamente
        doc.accept(visitor);

        //SFRUTTIAMO DIRETTAMENTE IL BUILDER DIRETTO DAL VISITOR PER SALVARE IN MEMORIA SECONDARIA

        //SI NOTI CHE PRIMA FACEVAMO

        //DocumentBuilder builder = new HTMLTextBuilder(pw);
       //TextDocumetParser tp = new TextDocumetParser(builder, new File(args[0]).toURI().toURL().toString());
        //tp.build();  -> il parser si occupava della stampa durante la costruzione




    }
}
