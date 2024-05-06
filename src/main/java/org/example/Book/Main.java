package org.example.Book;

public class Main {
    public static void main(String[] args) {
        RealBook book1 = new RealBook("La Vallée", "Bernard Minier");
        book1.readBook(book1.getTitle(), book1.getContent());
    }
}
