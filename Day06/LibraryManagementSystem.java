// 5. Library Management System
// Description: Develop a library management system:
// Use an abstract class LibraryItem with fields like itemId, title, and author.
// Add an abstract method getLoanDuration() and a concrete method getItemDetails().
// Create subclasses Book, Magazine, and DVD, overriding getLoanDuration() with specific logic.
// Implement an interface Reservable with methods reserveItem() and checkAvailability().
// Apply encapsulation to secure details like the borrower’s personal data.
// Use polymorphism to allow a general LibraryItem reference to manage all items, regardless of type.



// Implement an interface Reservable with methods reserveItem() and checkAvailability().
interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

// Use an abstract class LibraryItem with fields like itemId, title, and author.
abstract class LibraryItem implements Reservable{
    // attribute
    int itemId;
    String title;
    String author;
    boolean available;

    // constructor
    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        available = true;
    }
    // an abstract method getLoanDuration()
    abstract int getLoanDuration();

    // a concrete method getItemDetails().
    void getItemDetails(){
        System.out.println("The  title of the item is : "+ title + " and is made by : "+ author);
    }

// implementing the interface doing it in abstract class because funcnality is same for all the subclasses
    
    @Override
    public boolean checkAvailability() {
        return available;
    }
    
    @Override
    public void reserveItem() {
        System.out.println("Item Reserved");
        available = false;
        
    }
    
}


// Create subclasses Book, Magazine, and DVD, overriding getLoanDuration() with specific logic.
class Book extends LibraryItem {
    // loan duration for books
    int loanDuration = 30;
    
    @Override
    int getLoanDuration() {
        return loanDuration;
    }
        // constructor
    public Book(int itemId, String title, String author) {
        super(itemId, title, author);
        available = true;
    }
}

class Magazine extends LibraryItem {
    // loan duration for magzine
    int loanDuration = 10;
    @Override
    int getLoanDuration() {
        return loanDuration;
    }
    // constructor
    public Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
    }
    
}

class DVD extends LibraryItem {

    // loan duration for dvd
    int loanDuration = 2;
    @Override
    int getLoanDuration() {
        return loanDuration;
    }
        // constructor
    public DVD(int itemId, String title, String author) {
        super(itemId, title, author);
    }
    
}


public class LibraryManagementSystem {
    public static void main(String[] args) {
        // example of library management sys

        LibraryItem dvd1 = new DVD(56, "Hello Hello", "ABCD");
        LibraryItem magazine1 = new Magazine(99, "Current Affi", "news");
        LibraryItem book1 = new Book(95, "Harry Potter", "Rishabh");

        // getting loan duration for all three library object
        System.out.println(dvd1.getLoanDuration());
        System.out.println(magazine1.getLoanDuration());
        System.out.println(book1.getLoanDuration());

        // reserving the book1 object
        book1.reserveItem();

        // checking availability
        System.out.println(dvd1.checkAvailability());
        System.out.println(magazine1.checkAvailability());
        // will give false as it is reserved
        System.out.println(book1.checkAvailability());

        // getting item details
        dvd1.getItemDetails();
        magazine1.getItemDetails();
        book1.getItemDetails();
    }
}