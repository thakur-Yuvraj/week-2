import java.util.ArrayList;

// Book class
class Book {
     String title;
    private String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

}

// Library class that aggregates Book objects
class Library {
    private ArrayList<Book> books;

    // Method
    Library() {
        books = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to display all books in the library
    public void displayBooks() {
        System.out.println("Books in the library:");
        for (Book book : books) {
            System.out.println(book.title);
        }
    }
}

public class LibraryBooks {
    public static void main(String[] args) {
        // Create instances of Book
        Book book1 = new Book("In Depth of Forests", "Sahil Khemariya");
        Book book2 = new Book("Highway to heaven", "Amar Tyagi");
        Book book3 = new Book("Worthless Money", "SK shrinivas");

        // Create instances of Library
        Library library1 = new Library();
        Library library2 = new Library();

        // Add books to different libraries
        library1.addBook(book1);
        library1.addBook(book2);
        library2.addBook(book3);

        // Display books in each library
        library1.displayBooks();
        System.out.println(); 
        library2.displayBooks();

        // The books are not tied to a single library, so they can exist outside as well
        System.out.println("\nbooks:");
        System.out.println(book1.title);
        System.out.println(book2.title);
        System.out.println(book3.title);
    }
}
