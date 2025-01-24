public class SmartHomeDevices {
    public static void main(String[] args) {
        // Creating the thermostat object
        Thermostat thermostat1 = new Thermostat("T101", "Working", 23);
        // Displaying the details of the thermostat device
        thermostat1.displayStatus();
    }
}

// Devices class definition
class Devices {
    // Attributes
    public String deviceId;
    public String status;

    // Paramaterized constructor
    Devices(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }
}

// Thremostat class definition extending the devices class
class Thermostat extends Devices {
    // Attributes
    private int temperatureSetting;

    // Paramaterized constructor of thermostat class
    Thermostat(String deviceId, String status, int temperatureSetting) {
        // Passing the details to paramaterized constructor of the super class
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    // Method for diaplaying the details of the this device
    public void displayStatus() {
        System.out.println("Current status of the device is " + status
                + " and temperature setting of this thermostat is " + temperatureSetting);
    }
}