public class LibraryManagement {
    public static void main(String[] args) {
        // Creating the author class object
        Author author1 = new Author("Zero", 1856, "Ramanujan", "A renowned Indian Mathematician.");
        // Displaying the details of the books using the author class object
        author1.displayInfo();
    }
}

// Book Class definition
class Book {
    // Attributes
    public String title;
    public int pulbicationYear;

    // PAramaterized constructor
    Book(String title, int pulbicationYear) {
        this.title = title;
        this.pulbicationYear = pulbicationYear;
    }
}

// Author class extending the Book class properties
class Author extends Book {
    // Specific attributes
    private String name;
    private String bio;

    // Parameterized constructor
    Author(String title, int pulbicationYear, String name, String bio) {
        // Passing info to the super class parameterized constructor
        super(title, pulbicationYear);
        this.name = name;
        this.bio = bio;
    }

    // Method for displaying all details of the Author class
    public void displayInfo() {
        System.out.println("Title of the book is " + title + " and the publication year of this book is "
                + pulbicationYear + ". Name of the author is " + name + " and his bio is " + bio);
    }
}