import java.util.Iterator;

public class SearchBook {

    public int search(Book book) {
        int count = 0;
        Iterator iterator = book.iterator();
        while(iterator.hasNext()) {
            Page page = (Page)iterator.next();
            if (page.isHasImage() && (page.getPageNumber()%2 == 0)) {
                count++;
            }
        }
        return count;
    }
}
