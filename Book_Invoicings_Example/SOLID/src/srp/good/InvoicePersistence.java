package srp.good;

class InvoicePersistence {
  public void save(Invoice invoice) {
    // Implement File save logic
    System.out.println(invoice.book.name + " saved into File.");
  }
}
