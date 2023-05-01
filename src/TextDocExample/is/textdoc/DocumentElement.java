package TextDocExample.is.textdoc;

import TextDocExample.is.textdoc.visitor.TextDocumentVisitor;

public interface DocumentElement {
	String getText();

	default CompositeDocumentElement asComposite() {
		return null;
	}//si verifica che l'oggetto sia composite


	void accept(TextDocumentVisitor visitor);//per il pattern Visitor
}
