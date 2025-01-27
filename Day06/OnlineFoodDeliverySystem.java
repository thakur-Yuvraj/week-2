// 6. Online Food Delivery System
// Description: Create an online food delivery system:
// Define an abstract class FoodItem with fields like itemName, price, and quantity.
// Add abstract methods calculateTotalPrice() and concrete methods like getItemDetails().
// Extend it into classes VegItem and NonVegItem, overriding calculateTotalPrice() to include additional charges (e.g., for non-veg items).
// Use an interface Discountable with methods applyDiscount() and getDiscountDetails().
// Demonstrate encapsulation to restrict modifications to order details and use polymorphism to handle different types of food items in a single order-processing method.


// Use an interface Discountable with methods applyDiscount() and getDiscountDetails().
interface Discountable{
    public void applyDiscount();
    public double getDiscountDetails();
}

// Define an abstract class FoodItem with fields like itemName, price, and quantity.
abstract class FoodItem implements Discountable{
    // attributes
    String itemName;
    int price;
    int quantity;

    // constructor
    public FoodItem(String itemName, int price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double calculateTotalPrice() {
        return price * quantity;
    }

    public void getItemDetails() {
        System.out.println("Item name is : "+ itemName + ", price is : "+ price + " and quantity is : "+ quantity);
    }
}
// Extend the ffood item it into classes VegItem and NonVegItem, overriding calculateTotalPrice()

class VegItem extends FoodItem {
    double discount;

    // applying the discount
    @Override
    public void applyDiscount() {
        discount = 0.10;
        System.out.println("discount applied");
    }

    @Override
    public double getDiscountDetails() {
        System.out.println("Discount is of : "+ discount);
        return 0;
    }
    // constructor

    public VegItem(String itemName, int price, int quantity) {
        super(itemName, price, quantity);
    }
    
    // overriding the calc price of food
    public double calculateTotalPrice() {
        return (double)price * (double)quantity * (1.0-discount);
    }

}
class NonVegItem extends FoodItem{
    double discount;
    // applying the discount
    @Override
    public void applyDiscount() {
        discount = 0.2;
        System.out.println("discount applied");
    }

    @Override
    public double getDiscountDetails() {
        System.out.println("Discount is of : "+ discount);
        return 0;
    }

    public NonVegItem(String itemName, int price, int quantity) {
        super(itemName, price, quantity);
    }

    // overriding the calc price of food
    public double calculateTotalPrice() {
        return (double)price * (double)quantity * (1.0-discount);
    }
    
}

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        // creating objets of the food 
        FoodItem vegFoodItem1 = new VegItem("Ice Cream", 10, 2);

        // item before discount
        System.out.println(vegFoodItem1.calculateTotalPrice());

        // applying discount on the basis of veg or non-veg
        vegFoodItem1.applyDiscount();

        // discount price
        vegFoodItem1.getDiscountDetails();

        // item after discount
        System.out.println(vegFoodItem1.calculateTotalPrice());

        // creating another object
        FoodItem nonVegFoodItem1 = new NonVegItem("Bryani", 20, 1);

        // item before discount
        System.out.println(nonVegFoodItem1.calculateTotalPrice());

        // applying discount on the basis of veg or non-veg
        nonVegFoodItem1.applyDiscount();

        // discount price
        nonVegFoodItem1.getDiscountDetails();

        // item after discount
        System.out.println(nonVegFoodItem1.calculateTotalPrice());

    }
}