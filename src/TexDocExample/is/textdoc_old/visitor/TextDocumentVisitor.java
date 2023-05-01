package TexDocExample.is.textdoc_old.visitor;


//notiamo ancora una volta che questa interfaccia dipende dai tipi concreti
import TexDocExample.is.textdoc_old.Paragraph;
import TexDocExample.is.textdoc_old.Section;
import TexDocExample.is.textdoc_old.SubSection;
import TexDocExample.is.textdoc_old.TextDocument;

public interface TextDocumentVisitor {

	//per ogni classe concreta della nostra struttura, aggiungiamo un metodo
	void visit(TextDocument d);//i metodi si differenziano per il tipo di input

	void visit(Section s);

	void visit(SubSection sub);

	void visit(Paragraph p);
}
