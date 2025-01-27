

// Clothing class definition
public class Clothing extends Product {
    // Attributes
    private final double discountPercent;
    private final double taxPercent;

    Clothing(String productId, String name, double discountPercent, double taxPercent) {
        super(productId, name);
        this.discountPercent = discountPercent;
        this.taxPercent = taxPercent;
    }

    // Overridden methods
    @Override
    void calculateDiscount() {
        discountAmount = getPrice() * discountPercent / 100.0;
    }

    @Override
    public void calculateTax() {
        taxAmount = getPrice() * taxPercent / 100.0;
    }

    @Override
    public void getTaxDetails() {
        calculateTax();
        System.out.println("Tax percent on the clothing is " + taxPercent + " and on marked price " + getPrice() + ", it will amount to " + taxAmount);
    }

    @Override
    void displayProductDetails() {
        System.out.println("Name of the product is " + getName() + " and product id is " + getProductId() + ". It's price is " + getPrice());
        showDiscountAmount();
        getTaxDetails();
    }

    public void showDiscountAmount() {
        calculateDiscount();
        System.out.println("The discount on the amount " + getPrice() + " is " + discountAmount);
    }
}
