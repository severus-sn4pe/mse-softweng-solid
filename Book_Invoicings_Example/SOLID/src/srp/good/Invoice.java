package srp.good;

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
}
