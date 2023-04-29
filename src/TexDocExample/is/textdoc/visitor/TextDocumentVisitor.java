package TexDocExample.is.textdoc.visitor;

import TexDocExample.is.textdoc.Paragraph;
import TexDocExample.is.textdoc.Section;
import TexDocExample.is.textdoc.SubSection;
import TexDocExample.is.textdoc.TextDocument;

public interface TextDocumentVisitor {

	//per ogni classe concreta della nostra struttura, aggiungiamo un metodo
	void visit(TextDocument d);

	void visit(Section s);

	void visit(SubSection sub);

	void visit(Paragraph p);
}
