import java.util.ArrayList;

class Product {
    private String name;
    private double price;

    // Constructor to initialize product
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getter for product name
    public String getName() {
        return name;
    }

    // Getter for product price
    public double getPrice() {
        return price;
    }
}

class Order {
    private int orderId;
    private Customer customer;
    private ArrayList<Product> products;

    // Constructor to initialize order
    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    // Getter for order ID
    public int getOrderId() {
        return orderId;
    }

    // Getter for the customer who placed the order
    public Customer getCustomer() {
        return customer;
    }

    // Method to add a product to the order
    public void addProduct(Product product) {
        products.add(product);
    }

    // Getter for the list of products in the order
    public ArrayList<Product> getProducts() {
        return products;
    }

    // Method to calculate the total price of the order
    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }
}

class Customer {
    private String name;
    private ArrayList<Order> orders;

    // Constructor to initialize customer
    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    // Getter for customer name
    public String getName() {
        return name;
    }

    // Method to place an order
    public void placeOrder(Order order) {
        orders.add(order);
    }

    // Getter for the list of orders placed by the customer
    public ArrayList<Order> getOrders() {
        return orders;
    }
}

public class Ecommerce {
    public static void main(String[] args) {
        // Create products
        Product phone = new Product("Smartphone", 999.99);
        Product laptop = new Product("Laptop", 1499.99);
        Product headphones = new Product("Headphones", 199.99);

        // Create customers
        Customer raj = new Customer("Raj");
        Customer pankaj = new Customer("Pankaj");

        // Create orders and add products
        Order rajOrder1 = new Order(1, raj);
        rajOrder1.addProduct(phone);
        rajOrder1.addProduct(headphones);

        Order rajOrder2 = new Order(2, raj);
        rajOrder2.addProduct(laptop);

        Order pankajOrder = new Order(3, pankaj);
        pankajOrder.addProduct(phone);
        pankajOrder.addProduct(laptop);

        // Place orders for customers
        raj.placeOrder(rajOrder1);
        raj.placeOrder(rajOrder2);
        pankaj.placeOrder(pankajOrder);

        // Display customer orders and order details
        displayCustomerOrders(raj);
        displayCustomerOrders(pankaj);
    }

    // Method to display orders of a customer
    private static void displayCustomerOrders(Customer customer) {
        System.out.println("Customer: " + customer.getName());
        for (Order order : customer.getOrders()) {
            System.out.println(" - Order ID: " + order.getOrderId());
            System.out.println("   - Products:");
            for (Product product : order.getProducts()) {
                System.out.println("     - " + product.getName() + " - $" + product.getPrice());
            }
            System.out.println("   - Total: $" + order.calculateTotal());
        }
    }
}
