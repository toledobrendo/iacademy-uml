package com.iacademy.uml.sample3.model;

import java.util.Date;
import java.util.List;

public class Transaction {
    private Patron patron;
    private Librarian processedBy;
    private List<BookCopy> borrowedBooks;
    private Date dueDate;

    public boolean isValid() {
        return !borrowedBooks.isEmpty() && borrowedBooks.size() <= 10;
    }

    public Patron getPatron() {
        return patron;
    }

    public void setPatron(Patron patron) {
        this.patron = patron;
    }

    public Librarian getProcessedBy() {
        return processedBy;
    }

    public void setProcessedBy(Librarian processedBy) {
        this.processedBy = processedBy;
    }

    public List<BookCopy> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<BookCopy> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
}
