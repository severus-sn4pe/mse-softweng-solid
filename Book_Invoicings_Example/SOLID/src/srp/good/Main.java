package srp.good;

import srp.Book;

class Main{
  public static void main(String[] args) {
    Book book_one = new Book("Lord of the Flies", "William Golding", 1954, 15.00f, "1");
    Book book_two = new Book("Moonfleet", "J. Meade Falkner", 1898, 7.50f, "2");
    Book book_three = new Book("The Call of the Wild", "Jack London", 1903, 5.00f, "3");

    Invoice invoice_one = new Invoice(book_one, 4, 15.00, 12.00);
    Invoice invoice_two = new Invoice(book_two, 10, 50.00, 12.00);
    Invoice invoice_three = new Invoice(book_three, 50, 75.00, 12.00);

    InvoicePrinter printer = new InvoicePrinter();
    printer.printInvoice(invoice_one);
    printer.printInvoice(invoice_two);
    printer.printInvoice(invoice_three);

    InvoicePersistence persistance = new InvoicePersistence();
    persistance.save(invoice_one);
    persistance.save(invoice_two);
    persistance.save(invoice_three);
  }
}
