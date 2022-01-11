import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> borrowerCollection;

    public Borrower() {
        this.borrowerCollection = new ArrayList<>();
    }

    public int sizeOfCollectionBorrower() {
        return this.borrowerCollection.size();
    }

    public void borrowBook(Library library, Book book) {
       Book newBook = library.removeBook(book);
       borrowerCollection.add(newBook);
    }
}
