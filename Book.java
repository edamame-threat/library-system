// Book.java
public class Book {
    private String title;
    private Author author;
    private int pageCount;

    public Book(String title, Author author, int pageCount) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author.getName());
        System.out.println("Page Count: " + pageCount);
    }
}
