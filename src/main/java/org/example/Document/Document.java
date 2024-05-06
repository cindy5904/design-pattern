package org.example.Document;

public class Document implements DocumentOperation{

    @Override
    public void readDoc() {
        System.out.println("Document Lu");
    }

    @Override
    public void update() {
        System.out.println("Document Modifier");
    }
}
