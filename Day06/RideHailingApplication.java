// 8. Ride-Hailing Application
// Description: Develop a ride-hailing application:
// Define an abstract class Vehicle with fields like vehicleId, driverName, and ratePerKm.
// Add abstract methods calculateFare(double distance) and a concrete method getVehicleDetails().
// Create subclasses Car, Bike, and Auto, overriding calculateFare() based on type-specific rates.
// Use an interface GPS with methods getCurrentLocation() and updateLocation().
// Secure driver and vehicle details using encapsulation.
// Demonstrate polymorphism by creating a method to calculate fares for different vehicle types dynamically.



// Use an interface GPS with methods getCurrentLocation() and updateLocation().
interface GPS {
    public String getCurrentLocation();
    public String updateLocation();
}

// Define an abstract class Vehicle with fields like vehicleId, driverName, and ratePerKm.
abstract class Vehicle implements GPS{
    // attributes
    // Secure driver and vehicle details using encapsulation.
    private int vehicleId;
    private String driverName;
    public int ratePerKm = 10;

    // Add abstract methods calculateFare(double distance) and a concrete method getVehicleDetails().
    abstract double calculateFare(double distance);

    // printing details
    void getVehicleDetails() {
        System.out.println("The id of vehicle is : "+ vehicleId+ " driver name is : "+ driverName + " and rate / km is : "+ ratePerKm);
    }
    Vehicle (String driverName, int vehicleId){
        this.driverName = driverName;
        this.vehicleId = vehicleId;
    }
}

// Create subclasses Car, Bike, and Auto, overriding calculateFare() based on type-specific rates.
class Car extends Vehicle{

    @Override
    double calculateFare(double distance) {
        
        return distance * ratePerKm;
    }

    // methods to  getCurrentLocation() and updateLocation().
    public String getCurrentLocation(){
        return("getting cur locaton");
    };
    public String updateLocation() {
        return("updating current location");
    };

    // constructor
    Car(int ratePerKm, String driverName, int vehicleId) {
        super(driverName, vehicleId);
        this.ratePerKm = ratePerKm;
    }

    // invoking the super method to get details
    @Override
    void getVehicleDetails() {
        super.getVehicleDetails();
    }
    
}

class Bike extends Vehicle{

    @Override
    double calculateFare(double distance) {
        
        return distance * ratePerKm;
    }

    // methods to  getCurrentLocation() and updateLocation().
    public String getCurrentLocation(){
        return("getting cur locaton");
    };
    public String updateLocation() {
        return("updating current location");
    };

    // constructor
    Bike(int ratePerKm, String driverName, int vehicleId) {
        super(driverName, vehicleId);
        this.ratePerKm = ratePerKm;
    }

    @Override
    void getVehicleDetails() {
        super.getVehicleDetails();
    }
}

class Auto extends Vehicle{

    @Override
    double calculateFare(double distance) {
        
        return distance * ratePerKm;
    }

    // methods to  getCurrentLocation() and updateLocation().
    public String getCurrentLocation(){
        return("getting cur locaton");
    };
    public String updateLocation() {
        return("updating current location");
    };


    // constructor
    Auto(int ratePerKm, String driverName, int vehicleId) {
        super(driverName, vehicleId);
        this.ratePerKm = ratePerKm;
    }

    @Override
    void getVehicleDetails() {
        super.getVehicleDetails();
    }
}


public class RideHailingApplication {
    public static void main(String[] args) {

        // creating some example objects from classes
        Vehicle car1 = new Car(109, "Shivam jha", 985);
        Vehicle auto1 = new Auto(96, "sahil", 2143);
        Vehicle bike1 = new Bike(55, "ewe", 432);

        // getting locaton
        System.out.println(car1.getCurrentLocation());

        // updating locaton
        System.out.println(car1.updateLocation());

        // clculating fare for 100 kms
        System.out.println("Fare of car for 100 kms is : "+ car1.calculateFare(100));

        // printing the details
        car1.getVehicleDetails();
        auto1.getVehicleDetails();
        bike1.getVehicleDetails();

    }
}