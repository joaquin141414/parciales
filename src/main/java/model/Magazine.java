package model;

import java.util.Date;

public class Magazine extends LibraryItem{
    private String editor;
    private Date issueDate;

    public Magazine(int itemId, String title, String itemType, String editor, Date issueDate) {
        super(itemId, title, itemType);
        this.editor = editor;
        this.issueDate = issueDate;
    }
}
