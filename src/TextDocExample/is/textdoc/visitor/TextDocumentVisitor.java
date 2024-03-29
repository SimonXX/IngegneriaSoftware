package TextDocExample.is.textdoc.visitor;

import TextDocExample.is.textdoc.Paragraph;
import TextDocExample.is.textdoc.Section;
import TextDocExample.is.textdoc.SubSection;
import TextDocExample.is.textdoc.TextDocument;

public interface TextDocumentVisitor {//implementa un'operazione di visita per ogni elemento concreto del documento
	void visit(TextDocument d);

	void visit(Section s);

	void visit(SubSection sub);

	void visit(Paragraph p);
}
