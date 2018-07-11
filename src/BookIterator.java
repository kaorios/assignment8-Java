import java.util.Iterator;

public class BookIterator implements Iterator {
    private Book book;
    private int index;

    public BookIterator(Book book) {
        this.book = book;
        this.index = 1;
    }

    @Override
    public boolean hasNext() {
        if (index < book.getPageOfNumber()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Page next() {
        Page page = book.getPageAt(index);
        index++;
        return page;
    }
}
