package model;



import java.util.Date;

public class Loan {
    private int loanId;
    private User user;
    private LibraryItem item;
    private Date loanDate;
    private Date returnDate;

    public Loan(int loanId, User user, LibraryItem item, Date loanDate, Date returnDate) {
        this.loanId = loanId;
        this.user = user;
        this.item = item;
        this.loanDate = loanDate;
        this.returnDate = returnDate;
    }


}
