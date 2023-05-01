package TextDocExample.is.textdoc.txt;

import TextDocExample.is.textdoc.DocumentElement;
import TextDocExample.is.textdoc.Paragraph;
import TextDocExample.is.textdoc.Section;
import TextDocExample.is.textdoc.SubSection;
import TextDocExample.is.textdoc.TextDocument;
import TextDocExample.is.textdoc.visitor.TextDocumentVisitor;

import java.io.PrintStream;
import java.io.PrintWriter;

public class PlainTextVisitor implements TextDocumentVisitor {

	private final PrintWriter pw;

	public PlainTextVisitor(PrintWriter pw) {
		this.pw = pw;
	}

	public PlainTextVisitor(PrintStream ps) {
		pw = new PrintWriter(ps);
	}

	@Override
	public void visit(TextDocument doc) {
		pw.println("Title: " + doc.getTitle());
		for (DocumentElement de : doc)
			de.accept(this);
		pw.flush();
	}

	@Override
	public void visit(Section sec) {
		pw.println("Section: " + sec.getTitle());
		for (DocumentElement de : sec)
			de.accept(this);

	}

	@Override
	public void visit(SubSection sub) {
		pw.println("Subsection: " + sub.getTitle());
		for (DocumentElement de : sub)
			de.accept(this);

	}

	@Override
	public void visit(Paragraph p) {
		pw.println(p.getText());

	}

}
