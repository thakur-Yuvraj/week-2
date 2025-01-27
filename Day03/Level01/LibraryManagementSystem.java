

class Book {
    // Attributes
    static String libraryName = "KeepGrow Library";
    String title;
    String author;
    final int isbn;

    // Constructor
    Book(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Static method to display library name
    static void displayLibraryName() {
        System.out.println(libraryName);
    }

    // Method to display details of book
    void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book book = new Book("1984", "Grorge Orwell", 9845687);
        Book book1 = new Book("Atomic Habits", "James Clear", 78984563);
        if (book instanceof Book) {
            // Display book details
            book.displayBookDetails();
            book1.displayBookDetails();

            // Display library name
            Book.displayLibraryName();
        }
    }
}