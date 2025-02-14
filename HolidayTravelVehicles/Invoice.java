public class Invoice {
    private double price;
    private double tax;
    private double licenseFees;

    public Invoice(double price, double tax, double licenseFees) {
        this.price = price;
        this.tax = tax;
        this.licenseFees = licenseFees;
    }
}
