public class Customer extends Person {
    private int customerID;

    public Customer(String name, String address, String phoneNumber, int customerID) {
        super(name, address, phoneNumber);
        this.customerID = customerID;
    }

    public void addOptions() {
        System.out.println("Adding options...");
    }

    public void tradeVehicle() {
        System.out.println("Trading vehicle...");
    }
}
