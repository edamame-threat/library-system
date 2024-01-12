// LibrarySystem.java
public class LibrarySystem {
    public static void main(String[] args) {
        Author author1 = new Author("John Smith", 35);
        Author author2 = new Author("Jane Doe", 42);

        Book book1 = new Book("Introduction to Java", author1, 300);
        Book book2 = new Book("Data Structures and Algorithms", author2, 400);

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);

        System.out.println("Book Information:");
        for (Book book : library.getBooks()) {
            book.displayBookInfo();
            System.out.println();
        }
    }
}
