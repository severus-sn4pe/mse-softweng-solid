package srp.bad;

public class Invoice {
  // for easier understandability no getter and setter
  public Book book;
  public int quantity;
  public double discountRate;
  public double taxRate;
  public double total;

  static Book book_one = new Book("Lord of the Flies", "William Golding", 1954, 15.00f, "1");
  static Book book_two = new Book("Moonfleet", "J. Meade Falkner", 1898, 7.50f, "2");
  static Book book_three = new Book("The Call of the Wild", "Jack London", 1903, 5.00f, "3");

  static Invoice invoice_one = new Invoice(book_one, 4, 15.00, 12.00);
  static Invoice invoice_two = new Invoice(book_two, 10, 50.00, 12.00);
  static Invoice invoice_three = new Invoice(book_three, 50, 75.00, 12.00);

  public static void main(String[] args) {
    printInvoice(invoice_one);
    printInvoice(invoice_two);

    saveToDatabase(invoice_one);
    saveToDatabase(invoice_two);

    saveToFile(invoice_two);
    saveToFile(invoice_three);
  }

  public Invoice(Book book, int quantity, double discountRate, double taxRate) {
    this.book = book;
    this.quantity = quantity;
    this.discountRate = discountRate;
    this.taxRate = taxRate;
    this.total = this.calculateTotal();
  }

  // method which calculates the total price
  public double calculateTotal() {
    double price = ((book.price - book.price * discountRate) * this.quantity);

    double priceWithTaxes = price * (1 + taxRate);

    return priceWithTaxes;
  }

  // method that should print the invoicing
  public static void printInvoice(Invoice invoice) {
    System.out.println("Invoicing: " + invoice.quantity + " x " + invoice.book.name + " for " + invoice.book.price + "$");
    System.out.println("Discount Rate: " + invoice.discountRate);
    System.out.println("Tax Rate: " + invoice.taxRate);
    System.out.println("Total: " + invoice.total);
    System.out.println("\n");
  }

  // method, responsible for writing the invoicing into a file
  public static void saveToFile(Invoice invoice) {
    System.out.print(invoice.book.name + " saved into File.");
    System.out.println("\n");
  }

  // method, responsible for saving the invoicing into the DB
  public static void saveToDatabase(Invoice invoice){
    System.out.println(invoice.book.name + " saved into DB.");
    System.out.println("\n");
  }
}
