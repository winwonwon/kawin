public class Salesperson extends Person {
    private int customerID;

    public Salesperson(String name, String address, String phoneNumber, int customerID) {
        super(name, address, phoneNumber);
        this.customerID = customerID;
    }

    public void fillInvoice() {
        System.out.println("Filling invoice...");
    }
}
