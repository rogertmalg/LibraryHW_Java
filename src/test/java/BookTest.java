import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book1;


    @Before
    public void before() {

        book1 = new Book("Magic and Stuff", "Mary", "Fantasy");

    }

    @Test
    public void canGetTitle(){
        assertEquals("Magic and Stuff", book1.getTitle());
    }

    @Test
    public void canGetAuthor() {
        assertEquals("Mary", book1.getAuthor());
    }

    @Test
    public void canGetGenre() {
        assertEquals("Fantasy", book1.getGenre());
    }



}
