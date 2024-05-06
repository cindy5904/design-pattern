package org.example.Book;

public class RealBook implements Book{
    private String title;
    private String content;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public RealBook(String title, String content) {
        this.title = title;
        this.content = content;
    }


    @Override
    public void readBook(String title, String content) {
        System.out.println("Affiche livre"+title);
    }
}
