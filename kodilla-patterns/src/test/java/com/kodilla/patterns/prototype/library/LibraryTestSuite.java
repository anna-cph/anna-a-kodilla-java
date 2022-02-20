package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //Given
        Library library = new Library("Copenhagen's Library");
        library.getBooks().add(new Book("Mouse Superman", "XX xx", LocalDate.of(2017, 1, 13)));
        library.getBooks().add(new Book("Cat Terminator", "Yy yy", LocalDate.of(2000, 3, 22)));
        library.getBooks().add(new Book("Goat Whisperer", "Zz zz", LocalDate.of(2010, 7, 8)));

        //making a shallow copy of object board
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Warsaw's Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object board
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Berlin's Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        assertEquals(3, library.getBooks().size());
        assertEquals(3, clonedLibrary.getBooks().size());
        assertEquals(3, deepClonedLibrary.getBooks().size());
        assertEquals(clonedLibrary.getBooks(), library.getBooks());
        assertEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}
