public class Transaction {
    private String customerSignature;
    private Invoice salesInvoice;

    public Transaction(String customerSignature, Invoice salesInvoice) {
        this.customerSignature = customerSignature;
        this.salesInvoice = salesInvoice;
    }
}
