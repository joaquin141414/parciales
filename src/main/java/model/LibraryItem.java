package model;



public abstract class LibraryItem {
    protected int itemId;
    protected String title;
    protected String itemType;

    public LibraryItem(int itemId, String title, String itemType) {
        this.itemId = itemId;
        this.title = title;
        this.itemType = itemType;
    }
}