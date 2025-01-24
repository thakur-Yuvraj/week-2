// Vehicle class definition (super class)
class Vehicle {
    public double maxSpeed;
    public String fuelType;

    public Vehicle(double maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    // Display method definition
    public void displayInfo() {
        System.out.println("max speed is : "+ maxSpeed+ " fuel type is : "+ fuelType);
    }
}

// Truck class definition extending the vehicle class
class Truck extends Vehicle {
    // Attribute
    private int seatingCapacity;

    // Parameterized constructor
    Truck(double maxSpeed, String fuelType, int seatingCapacity) {
        super(maxSpeed, fuelType);
        this.seatingCapacity = seatingCapacity;
    }

    // displaying the details of the truck
    @Override
    public void displayInfo() {
        System.out.println("This truck max speed is " + maxSpeed + " and fuel type it consume is " + fuelType
                + ".It's seating capacity is " + seatingCapacity);
    }
}

// Car class definition extending the vehicle class
class Car extends Vehicle {
    // Attribute
    private int seatingCapacity;

    // Parameterized constructor
    Car(double maxSpeed, String fuelType, int seatingCapacity) {
        super(maxSpeed, fuelType);
        this.seatingCapacity = seatingCapacity;
    }

    // displaying the details of the car
    @Override
    public void displayInfo() {
        System.out.println("This car max speed is " + maxSpeed + " and fuel type it consume is " + fuelType
                + ".It's seating capacity is " + seatingCapacity);
    }
}

// MotorCycle class definition extending the vehicle class
class MotorCycle extends Vehicle {
    // Attribute
    private int seatingCapacity;

    // Parameterized constructor
    MotorCycle(double maxSpeed, String fuelType, int seatingCapacity) {
        super(maxSpeed, fuelType);
        this.seatingCapacity = seatingCapacity;
    }

    // displaying the details of the motorcycle
    @Override
    public void displayInfo() {
        System.out.println("This Motorcycle max speed is " + maxSpeed + " and fuel type it consume is " + fuelType
                + ".It's seating capacity is " + seatingCapacity);
    }
}

public class VehicleAndTransportSystem {
    public static void main(String[] args) {
        // Truck object created
        Truck truck1 = new Truck(89.5, "Diesel", 5);
        // Displaying the detail of the truck object
        truck1.displayInfo();

        // Car object created
        Car car1 = new Car(120, "Diesel", 4);
        // Displaying the car details
        car1.displayInfo();

        // Motorcycle object created
        MotorCycle motorCycle1 = new MotorCycle(125, "Petrol", 2);
        // Displaying the details of motorcycle
        motorCycle1.displayInfo();
    }
}

