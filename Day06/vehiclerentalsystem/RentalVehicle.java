package encapsulation_and_polymorphism.vehiclerentalsystem;

import java.util.ArrayList;

public class RentalVehicle {
    public static void main(String[] args) {
        // List of the vehicles
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        // Creating the different vehicle type objects adding to the list
        Vehicle bmw = new Car("BMW102", "BMW sporting car", 22000, 9599, 3500, 3500, 2500);
        vehicles.add(bmw);

        Vehicle truck1 = new Car("T102", "Transport truck", 10000, 8099, 1999, 1999, 1800);
        vehicles.add(truck1);

        Vehicle fz = new Car("B102", "FZ sporting Bike", 8000, 1999, 1500, 1500, 999);
        vehicles.add(fz);

        // Iterating the loop for the details of the vehicles
        for(Vehicle vehicle : vehicles) {
            System.out.println("Type of the vehicle is " + vehicle.getType());
            vehicle.getInsuranceDetails();
            vehicle.calculateRentalCost((int)(Math.random()*10));
            System.out.println("-------------------------------------");
        }
    }
}
