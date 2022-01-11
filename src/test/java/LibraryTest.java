import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;

    @Before
    public void before() {
        library = new Library();
        book1 = new Book("Magic and Stuff", "Mary", "Fantasy");
        book2 = new Book("The Wizards Beard", "Gary", "Fantasy");
    }

    @Test
    public void collectionIsEmpty() {
        assertEquals(0, library.sizeOfCollection());
    }

    @Test
    public void canAddBook() {
        library.addBook(book1);
        assertEquals(1, library.sizeOfCollection());
    }

    @Test
    public void canCheckCapacity() {
        assertEquals(true, library.hasCapacity());
    }

    @Test
    public void cantAddMoreThan5Books() {
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book1);
        assertEquals(5, library.sizeOfCollection());
    }

    @Test
    public void canRemoveBook() {
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2, library.sizeOfCollection());
        library.removeBook(book2);
        assertEquals(1, library.sizeOfCollection());
    }
}
