package TexDocExample.is.textdoc_old;

public interface CompositeDocumentElement extends DocumentElement,
		Iterable<DocumentElement> {
	
	DocumentElement getChild(int i);

	void addChild(DocumentElement el);

	void removeChild(int i);

	int getChildrenCount();

}
