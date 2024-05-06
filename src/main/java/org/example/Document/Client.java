package org.example.Document;

public class Client {
    public static void main(String[] args) {
        DocumentProxy document = new DocumentProxy();
        document.readDoc();
        document.update();
    }
}
