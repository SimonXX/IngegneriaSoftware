package TextDocExample.is.textdoc.builder;

import TextDocExample.is.textdoc.CompositeDocumentElement;
import TextDocExample.is.textdoc.Paragraph;
import TextDocExample.is.textdoc.Section;
import TextDocExample.is.textdoc.SubSection;
import TextDocExample.is.textdoc.TextDocument;

import java.util.Deque;
import java.util.LinkedList;

public class TextDocumentBuilder implements DocumentBuilder {

	private final Deque<CompositeDocumentElement> stack=new LinkedList<>();
	private TextDocument doc;

	private boolean ready = false;

	public TextDocument getDocument() {
		if (!ready)
			throw new IllegalStateException();
		ready = false;
		return doc;

	}

	/* (non-Javadoc)
	 * @see is.textdoc.DocumentBuilder#openDocument(java.lang.String)
	 */
	@Override
	public void openDocument(String title) {
		ready = false;
		TextDocument document = new TextDocument();
		document.setTitle(title);
		stack.push(document);
	}

	/* (non-Javadoc)
	 * @see is.textdoc.DocumentBuilder#closeDocument()
	 */
	@Override
	public void closeDocument() {
		ready = true;
		doc=(TextDocument) stack.pop();
	}

	/* (non-Javadoc)
	 * @see is.textdoc.DocumentBuilder#openSection(java.lang.String)
	 */
	@Override
	public void openSection(String title) {

		Section section = new Section(title);
		stack.peek().addChild(section);
		stack.push(section);

	}

	/* (non-Javadoc)
	 * @see is.textdoc.DocumentBuilder#addParagraph(java.lang.String)
	 */
	@Override
	public void addParagraph(String text) {
		Paragraph p = new Paragraph(text);
		stack.peek().addChild(p);


	}

	/* (non-Javadoc)
	 * @see is.textdoc.DocumentBuilder#closeSection()
	 */
	@Override
	public void closeSection() {
        stack.pop();
	}

	/* (non-Javadoc)
	 * @see is.textdoc.DocumentBuilder#openSubsection(java.lang.String)
	 */
	@Override
	public void openSubsection(String title) {

		SubSection subsection = new SubSection(title);
		stack.peek().addChild(subsection);
		stack.push(subsection);

	}

	/* (non-Javadoc)
	 * @see is.textdoc.DocumentBuilder#closeSubSection()
	 */
	@Override
	public void closeSubsection() {
        stack.pop();
	}
}