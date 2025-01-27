//Create an abstract class Product with fields like productId, name, and price, and an abstract method calculateDiscount().


public abstract class Product implements Taxable {
    private String productId;
    private String name;
    private double price;
    public double discountAmount;
    public double taxAmount;


    Product(String productId, String name) {
        this.productId = productId;
        this.name = name;
    }

    // Setters and Getters
    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductId() {
        return productId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        if(price < 0) {
            System.out.println("Price can not be negative!! Try again.");
            return;
        }

        this.price = price;
    }

    public double getPrice() {
        if(price == 0.0) {
            System.out.println("Price of the product is not set! First set it.");
        }
        return price;
    }

    // Abstract method
    abstract void calculateDiscount();
    abstract void displayProductDetails();
}
