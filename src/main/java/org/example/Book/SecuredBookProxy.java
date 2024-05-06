package org.example.Book;

public class SecuredBookProxy implements Book{
    private RealBook realBook;
    private boolean isUserPrenium;

    public SecuredBookProxy(String title, String content) {
        realBook = new RealBook(title, content);
        isUserPrenium = true;

    }

    @Override
    public void readBook(String title, String content) {
        if(isUserPrenium) {
            realBook.readBook(title, content);
        } else {
            throw new RuntimeException("Vous n'êtes pas prenium");
        }


    }
}

