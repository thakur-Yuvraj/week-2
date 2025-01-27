package encapsulation_and_polymorphism.vehiclerentalsystem;

// Abstract class Vehicle definition, implementing the interface insurable
public abstract class Vehicle implements Insurable {
    // Attributes
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    // Parameterized constructor
    Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    // Abstract method for rental calculation
    public abstract void calculateRentalCost(int days);

    // Getters and Setters
    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    public double getRentalRate() {
        return rentalRate;
    }
}
