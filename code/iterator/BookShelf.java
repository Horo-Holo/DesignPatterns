import java.util.ArrayList;

/**
 * @author Yuukin
 * @data 2022/12/2 10:34
 */
public class BookShelf implements Aggregate{

    private ArrayList books;

    private int last = 0;

    public BookShelf(int initsize) {
        this.books = new ArrayList(initsize);
    }

    public Book getBookAt(int index) {
        return (Book) books.get(index);
    }

    public void appendBook(Book book) {
        books.add(book);
    }

    public int getLength() {
        return books.size();
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}