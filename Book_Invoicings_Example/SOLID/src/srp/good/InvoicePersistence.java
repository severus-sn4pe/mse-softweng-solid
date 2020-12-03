package srp.good;

class InvoicePersistence {
  public void save(Invoice invoice) {
    // Implement File save logic
    System.out.print(invoice.book.name + " saved in File.");
    System.out.println("\n");
  }
}
