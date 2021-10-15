package com.iacademy.uml.sample3.model;

import com.iacademy.uml.sample3.reference.BookStatus;

public class BookCopy {
    private Book book;
    private BookStatus status;

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public BookStatus getStatus() {
        return status;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }
}
