public class OnlineRetailOrderManagement {
    public static void main(String[] args) {
        DeliveredOrder order1 = new DeliveredOrder("D234", "22/03/2024", 234121, "30/3/2024");
        order1.displayDeliveredOrderDetail();
    }
}

// Order class Definition
class Order {
    // Attributes
    public String orderId;
    public String orderDate;

    // Parameterized constructor
    Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // displaying the order details
    public void displayOrderDetail() {
        System.out.println("Detail of the order is: order id is " + orderId + " and order date is " + orderDate);
    }
}

// Shipped order class definition
class ShippedOrder extends Order {
    // Attribute
    public int trackingNumber;

    // Parameterized order
    ShippedOrder(String orderId, String orderDate, int trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    // Method for the displaying the details of shipped order
    public void displayShippedOrderDetail() {
        displayOrderDetail();
        System.out.println("Tracking number of shipped order is: " + trackingNumber);
    }
}

// Delivered order definition
class DeliveredOrder extends ShippedOrder {
    // Attribute
    public String deliveryDate;

    // Parameterized constructor
    DeliveredOrder(String orderId, String orderDate, int trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    // Method for displaying the delivered order
    public void displayDeliveredOrderDetail() {
        displayShippedOrderDetail();
        System.out.println("Date of delivered order is: " + deliveryDate);
    }
}