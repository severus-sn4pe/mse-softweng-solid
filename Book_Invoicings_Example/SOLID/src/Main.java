// Source : https://www.freecodecamp.org/news/solid-principles-explained-in-plain-english/

class Main{

    static Book book_one = new Book("X", "Bob", 2010, 55, "12312381723");
    static Book book_two = new Book("Y", "Paul", 1990, 119, "234234345345");
    static Book book_three = new Book("Z", "Kevin", 2004, 20, "2342342342342");
    
    static Invoice invoice_one = new Invoice(book_one, 4, 15.00, 12.00);
    static Invoice invoice_two = new Invoice(book_two, 10, 50.00, 12.00);
    static Invoice invoice_three = new Invoice(book_three, 50, 75.00, 12.00);
    
    public static void main(String[] args) {
        InvoicePrinter invoicePrinter = new InvoicePrinter(invoice_one);
        invoicePrinter.printInvoice();

        DatabasePersistence databasePersistence = new DatabasePersistence();
        databasePersistence.save(invoice_one);
    }
}