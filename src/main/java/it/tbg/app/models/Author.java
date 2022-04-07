package it.tbg.app.models;

import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

public class Author {
    public String firstName;
    public String lastName;
    private Set<Book> books;
    private LocalDate dateOfBirth;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
