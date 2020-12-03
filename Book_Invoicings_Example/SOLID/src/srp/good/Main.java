package srp.good;

import srp.Book;

class Main{
  static Book book_one = new Book("Lord of the Flies", "William Golding", 1954, 15.00f, "1");
  static Book book_two = new Book("Moonfleet", "J. Meade Falkner", 1898, 7.50f, "2");
  static Book book_three = new Book("The Call of the Wild", "Jack London", 1903, 5.00f, "3");

  static Invoice invoice_one = new Invoice(book_one, 4, 15.00, 12.00);
  static Invoice invoice_two = new Invoice(book_two, 10, 50.00, 12.00);
  static Invoice invoice_three = new Invoice(book_three, 50, 75.00, 12.00);

  public static void main(String[] args) {
    InvoicePrinter invoice_printer_one = new InvoicePrinter(invoice_one);
    InvoicePrinter invoice_printer_two = new InvoicePrinter(invoice_three);
    invoice_printer_one.printInvoice();
    invoice_printer_two.printInvoice();

    InvoicePersistence persistance = new InvoicePersistence();
    persistance.save(invoice_one);
    persistance.save(invoice_two);
  }
}
