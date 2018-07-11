public class Main {

    public static Book book1;

    public static void main(String[] args) {
        createBooks();

        SearchBook searchBook = new SearchBook();
        System.out.println("The number of pages that have images and their page number is an even number.");
        System.out.println(searchBook.search(book1));

    }

    private static void createBooks() {
        book1 = new Book("Java programing", Book.BookCategory.IT, 30);
        book1.setImagePage(3);
        book1.setImagePage(12);
        book1.setImagePage(20);
        book1.setImagePage(27);
        book1.setImagePage(28);
    }
}
