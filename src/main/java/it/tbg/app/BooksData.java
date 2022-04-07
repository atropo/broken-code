package it.tbg.app;

import it.tbg.app.models.Author;
import it.tbg.app.models.Book;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class BooksData {

    public static Author StephenKing(){

        Book carrie = new Book("Carrie", 1974, 199, Book.Type.FICTION);
        Book salem = new Book("Salem's Lot", 1975, 439, Book.Type.FICTION);
        Book shining = new Book("The Shining", 1977, 439, Book.Type.FICTION);
        Book rage = new Book("Rage", 1977, 439, Book.Type.FICTION);
        Book theStand = new Book("The Stand", 1978, 823, Book.Type.FICTION);
        Book theLongWalk = new Book("The Long Walk", 1979, 384, Book.Type.FICTION);
        Book theDeadZone = new Book("The Dead Zone", 1979, 428, Book.Type.FICTION);
        Book fireStarter = new Book("Firestarter", 1980, 426, Book.Type.FICTION);
        Book roadwork = new Book("Roadwork", 1980, 274, Book.Type.FICTION);
        Book cujo = new Book("Cujo", "1981", 319, Book.Type.FICTION);
        Book nightShift = new Book("Night Shift", 1980, 336, Book.Type.COLLECTION);
        Book differentSeasons = new Book("Different Seasons", 1982, 527, Book.Type.COLLECTION);
        Book danseMacabre = new Book("Danse Macabre", 1981, 400, Book.Type.NON_FICTION);

        Set<Book> books = new HashSet<>();
        books.add(carrie);
        books.add(salem);
        books.add(shining);
        books.add(rage);
        books.add(theStand);
        books.add(theLongWalk);
        books.add(theDeadZone);
        books.add(fireStarter);
        books.add(roadwork);
        books.add(cujo);
        books.add(nightShift);
        books.add(differentSeasons);
        books.add(danseMacabre);

        Author stephenKing = new Author("Stephen", "King");
        stephenKing.setBooks(books);
        return stephenKing;
    }
}
