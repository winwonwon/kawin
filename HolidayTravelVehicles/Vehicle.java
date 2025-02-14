public class Vehicle {
    protected String serialNumber;
    protected String manufacturer;
    protected String model;
    protected int year;

    public Vehicle(String serialNumber, String manufacturer, String model, int year) {
        this.serialNumber = serialNumber;
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Vehicle Info:");
        System.out.println("Serial Number: " + serialNumber);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}
