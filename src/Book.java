import java.util.Iterator;

public class Book<T> implements Iterable<T> {
    public static enum BookCategory {
        Science,
        History,
        Food,
        IT,
        Engineering,
        Novel,
    }
    private String title;
    private BookCategory category;
    private Page[] pages;

    Book(String title, BookCategory category, int pageOfNumber) {
        this.title = title;
        this.category = category;
        this.pages = new Page[pageOfNumber];
        for (int i=0; i<pageOfNumber; i++) {
            this.pages[i] = new Page(i+1, false);
        }
    }

    @Override
    public Iterator iterator() {
        return new BookIterator(this);
    }

    public void setImagePage(int pageNumber) {
        this.pages[pageNumber-1].setHasImage(true);
    }

    public int getPageOfNumber() {
        return this.pages.length;
    }

    public Page getPageAt(int index) {
        return this.pages[index];
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BookCategory getCategory() {
        return category;
    }

    public void setCategory(BookCategory category) {
        this.category = category;
    }

    public Page[] getPages() {
        return pages;
    }
}
