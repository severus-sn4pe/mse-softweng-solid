package srp.good;

// Handles printing logic
class InvoicePrinter {
  public InvoicePrinter(){
  }

  // method that should print the invoicing
  public void printInvoice(Invoice invoice) {
    System.out.println("Invoicing: " + invoice.quantity + " x " + invoice.book.name + " for " + invoice.book.price + "$");
    System.out.println("Discount Rate: " + invoice.discountRate);
    System.out.println("Tax Rate: " + invoice.taxRate);
    System.out.println("Total: " + invoice.total);
    System.out.println("\n");
  }
}
