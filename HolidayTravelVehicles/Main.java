public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("John Doe", "123 Main St", "555-1234", 101);
        Vehicle vehicle = new Vehicle("SN12345", "Toyota", "Camry", 2022);
        TradeInVehicle tradeIn = new TradeInVehicle("SN54321", "Honda", "Civic", 2019, "T123", "Well-maintained trade-in", 12000);
        Invoice invoice = new Invoice(30000, 2500, 500);
        Salesperson salesperson = new Salesperson("Jane Smith", "456 Elm St", "555-5678", 101);
        Transaction transaction = new Transaction("John Doe", invoice);

        customer.tradeVehicle();
        salesperson.fillInvoice();
        System.out.println("Transaction completed.");
    }
}
