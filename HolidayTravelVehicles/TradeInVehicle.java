public class TradeInVehicle extends Vehicle {
    private String optionCode;
    private String description;
    private double price;

    public TradeInVehicle(String serialNumber, String manufacturer, String model, int year, String optionCode, String description, double price) {
        super(serialNumber, manufacturer, model, year);
        this.optionCode = optionCode;
        this.description = description;
        this.price = price;
    }
}
