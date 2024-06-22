package org.example;

public class BookVisit {
    private Long bookId;
    private String bookTitle;
    private int visitCount;

    public BookVisit(Long bookId, String bookTitle, int visitCount) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.visitCount = visitCount;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public int getVisitCount() {
        return visitCount;
    }

    public void setVisitCount(int visitCount) {
        this.visitCount = visitCount;
    }
}