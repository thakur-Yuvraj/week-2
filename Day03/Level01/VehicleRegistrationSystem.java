

class Vehicle {
    // Attributes
    static int registrationFee = 500;
    String ownerName;
    String vehicleType;
    final int registrationNumber;

    // Constructor
    Vehicle(String ownerName, String vehicleType, int registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // Static method to update registration fee
    static void updateRegistrationFee(int updatedRegistrationFee) {
        registrationFee = updatedRegistrationFee;
    }

    // Method to display vehicle details
    void displayDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Registration Fee: " + registrationFee);
    }
}

public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        Vehicle car = new Vehicle("Rohan", "Private", 785946);
        Vehicle omni = new Vehicle("Raju", "Taxi", 786549);
        if (omni instanceof Vehicle) {
            // Display vehicle registration details
            car.displayDetails();
            omni.displayDetails();

            // Update registration fee
            Vehicle.updateRegistrationFee(1000);

            // Display vehicle registration details after updating registration fee
            car.displayDetails();
            omni.displayDetails();
        }
    }
}