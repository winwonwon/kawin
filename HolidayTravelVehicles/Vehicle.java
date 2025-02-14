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
}
