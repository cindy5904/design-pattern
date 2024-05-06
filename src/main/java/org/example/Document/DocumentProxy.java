package org.example.Document;

public class DocumentProxy implements DocumentOperation{
    private Document document;

    public DocumentProxy() {
        document = new Document();
    }

    @Override
    public void readDoc() {
        System.out.println("Lecture du document");
        document.readDoc();
    }

    @Override
    public void update() {
        System.out.println("Modification du document");
        document.update();
    }
}
