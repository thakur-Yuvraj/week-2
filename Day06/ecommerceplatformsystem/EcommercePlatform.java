//Description: Develop a simplified e-commerce platform:
//Create an abstract class Product with fields like productId, name, and price, and an abstract method calculateDiscount().
//Extend it into concrete classes: Electronics, Clothing, and Groceries.
//Implement an interface Taxable with methods calculateTax() and getTaxDetails() for applicable product categories.
//Use encapsulation to protect product details, allowing updates only through setter methods.
//Showcase polymorphism by creating a method that calculates and prints the final price (price + tax - discount) for a list of Product.


import java.util.ArrayList;

public class EcommercePlatform {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();

        Product charger = new Electronics("C233", "Boat super charger", 12.55, 22);
        charger.setPrice(455.34);
        products.add(charger);

        Product mobile = new Electronics("IP433", "IPhone", 13.32, 35);
        mobile.setPrice(75555.34);
        products.add(mobile);

        Product shop = new Electronics("S452", "Sandal soap", 15.75, 12);
        shop.setPrice(55.34);
        products.add(shop);

        Product underwear = new Electronics("U964", "Onn", 25.5, 10);
        underwear.setPrice(155.34);
        products.add(underwear);

        for(Product product : products) {
            product.displayProductDetails();
            double finalPrice = product.getPrice() - product.taxAmount - product.discountAmount;
            System.out.println("Final price of this product will be " + finalPrice);
            System.out.println("--------------------------------------------------------");
        }
    }
}
