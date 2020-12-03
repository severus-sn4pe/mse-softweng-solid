package srp.bad;

import srp.Book;

public class Invoice {
  // for easier understandability no getter and setter
  public Book book;
  public int quantity;
  public double discountRate;
  public double taxRate;
  public double total;

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
  public void printInvoice() {
    System.out.println("Invoicing: " + quantity + " x " + book.name + " for " + book.price + "$");
    System.out.println("Discount Rate: " + discountRate);
    System.out.println("Tax Rate: " + taxRate);
    System.out.println("Total: " + total);
    System.out.println("\n");
  }

  // method, responsible for writing the invoicing into a file
  public void saveToFile() {
    System.out.print(book.name + " saved into File.");
    System.out.println("\n");
  }

  // method, responsible for saving the invoicing into the DB
  public void saveToDatabase(){
    System.out.println(book.name + " saved into DB.");
    System.out.println("\n");
  }
}
