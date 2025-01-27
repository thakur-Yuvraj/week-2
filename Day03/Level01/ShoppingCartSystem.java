

class Product {
    // Attributes
    static int discount = 25; // In percent
    String productName;
    int price;
    int quantity;
    final int productId;

    // Constructor
    Product(String productName, int price, int quantity, int productId) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productId = productId;
    }

    // Static method to update discount
    static void updateDiscount(int updatedDiscount) {
        discount = updatedDiscount;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Product Price: " + price);
        System.out.println("Product Quantity: " + quantity);
        System.out.println("Product Id: " + productId);
        System.out.println("Discount : " + discount + "%");

    }
}

public class ShoppingCartSystem {
    public static void main(String[] args) {
        Product product1 = new Product("Soap", 20, 1, 202);
        if (product1 instanceof Product) {
            // Display product details before updating discount
            product1.displayDetails();

            // Updating discount
            Product.updateDiscount(10);

            // Display product details before updating discount
            product1.displayDetails();
        }
    }
}