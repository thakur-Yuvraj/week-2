package encapsulation_and_polymorphism.vehiclerentalsystem;

public class Bike extends Vehicle {
    // Attributes
    private double basePremium;
    private double addOns;
    private double ncb;
    private double taxAmount;

    Bike(String vehicleNumber, String type, double rentalRate, double basePremium, double addOns, double ncb, double taxAmount) {
        super(vehicleNumber, type, rentalRate);
        this.basePremium = basePremium;
        this.addOns = addOns;
        this.ncb = ncb;
        this.taxAmount = taxAmount;
    }

    // Overriding the methods
    @Override
    public void calculateRentalCost(int days) {
        double rentalCost = getRentalRate() * days;
        System.out.println("Rental cost for " + days + " days of this vehicle will amount to " + rentalCost);
    }

    @Override
    public void calculateInsurance() {
        double insurancePremium = (basePremium + addOns) - ncb + taxAmount;
        System.out.println("Insurance needed to pay for this vehicle is " + insurancePremium);
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Base premium for this vehicle is " + basePremium + " and add-Ons is " + addOns + ", ncb " + ncb + " and tax amount of " + taxAmount);
        calculateInsurance();
    }
}
