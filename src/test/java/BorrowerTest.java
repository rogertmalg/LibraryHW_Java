import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    private Borrower borrower;
    private Library library;
    private Book book1;

    @Before
    public void before() {
        borrower = new Borrower();
        library = new Library();
        book1 = new Book("Magic and Stuff", "Mary", "Fantasy");
    }

    @Test
    public void borrowerCollectionStartsAtZero() {
        assertEquals(0, borrower.sizeOfCollectionBorrower());
    }

    @Test
    public void canBorrowBook() {
        library.addBook(book1);
        borrower.borrowBook(library, book1);
        assertEquals(1, borrower.sizeOfCollectionBorrower());
        assertEquals(0, library.sizeOfCollection());
    }
}
