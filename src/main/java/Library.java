import java.util.ArrayList;

public class Library {

    public ArrayList<Book> bookCollection;
    private int capacity;

    public Library(){
        this.bookCollection = new ArrayList<>();
        this.capacity = 5;
    }

    public int sizeOfCollection() {
        return this.bookCollection.size();
    }

    public void addBook(Book book) {
        if (hasCapacity()) {
            this.bookCollection.add(book);
        }
    }

    public boolean hasCapacity() {
        if(sizeOfCollection() < this.capacity) {
            return true;
        }
        return false;
    }

    public Book removeBook(Book book) {
        int index = this.bookCollection.indexOf(book);
        return this.bookCollection.remove(index);
    }
}
