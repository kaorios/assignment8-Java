import java.util.ArrayList;
import java.util.List;

public class Main {

    public static Book<Page> book;

    public static void main(String[] args) {
        createBooks();

        //Problem1
        System.out.println("The number of pages that have images and their page number is an even number.");
        SearchBook searchBook = new SearchBook();
        System.out.println("SearchBook:");
        System.out.println(searchBook.search(book));

        //Problem2
        GenericSearch<Book, Page> genericSearch = new GenericSearch<>();
        PagePredicate pagePredicate = new PagePredicate();
        System.out.println("SearchBook:");
        System.out.println(genericSearch.search(book, pagePredicate));

        //Problem3
        GenericSearchList<Book, Page> genericSearchList = new GenericSearchList<>();
        System.out.println("GenericSearchList:");
        List<Page> pageList = genericSearchList.search(book, pagePredicate);
        for (Page page: pageList) {
            System.out.println("Page number is :" + page.getPageNumber());
        }
    }

    private static void createBooks() {
        book = new Book<>("Java programing", Book.BookCategory.IT, 30);
        book.setImagePage(3);
        book.setImagePage(12);
        book.setImagePage(20);
        book.setImagePage(27);
        book.setImagePage(28);
    }
}
