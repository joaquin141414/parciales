package model;

public class Book extends LibraryItem{
    private int publicationyear;
    private String author;

    public Book(int itemId, String title, String itemType, int publicationyear, String author) {
        super(itemId, title, itemType);
        this.publicationyear = publicationyear;
        this.author = author;
    }
}
