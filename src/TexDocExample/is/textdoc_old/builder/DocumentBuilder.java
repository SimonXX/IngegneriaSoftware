package TexDocExample.is.textdoc_old.builder;

public interface DocumentBuilder {

	void openDocument(String title);

	void closeDocument();

	void openSection(String title);

	void closeSection();

	void openSubsection(String title);

	void closeSubsection();

	void addParagraph(String text);

}