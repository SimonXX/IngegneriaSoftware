package TexDocExample.is.textdoc;

import TexDocExample.is.textdoc.visitor.TextDocumentVisitor;

public interface DocumentElement {
	String getText();

	default CompositeDocumentElement asComposite() {
		return null;
	}

	CompositeDocumentElement getParent();

	void accept(TextDocumentVisitor visitor);
}
