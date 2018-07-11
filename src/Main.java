import java.util.ArrayList;

public class Main {

    public static Book book1;
    public static Book book2;

    public static void main(String[] args) {
        createBooks();

        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);


        SearchBook searchBook = new SearchBook();
        System.out.println("The number of pages that have images and their page number is an even number.");
        System.out.println(searchBook.search(book1));

        System.out.println("Books:");
        GenericSearch<Book> genericSearch = new GenericSearch<>();
        System.out.println(genericSearch.search(bookList));

    }

    private static void createBooks() {
        book1 = new Book("Java programing", Book.BookCategory.IT, 30);
        book1.setImagePage(3);
        book1.setImagePage(12);
        book1.setImagePage(20);
        book1.setImagePage(27);
        book1.setImagePage(28);

        book2 = new Book("C programing", Book.BookCategory.IT, 20);

    }
}
