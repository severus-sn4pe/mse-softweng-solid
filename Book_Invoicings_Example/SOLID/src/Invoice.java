// handles calculation business logic
// Single Responsibility Principle - Invoice class handles only the invoicing calculation business logic

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

    /*
    // method that should print the invoicing
    // SHOULD BE REMOVED IN SEPERATE CLASS
	public void printInvoice() {
            System.out.println(quantity + "x " + book.name + " " +          book.price + "$");
            System.out.println("Discount Rate: " + discountRate);
            System.out.println("Tax Rate: " + taxRate);
            System.out.println("Total: " + total);
	}

    // method, responsible for writing the invoicing into a file
    // SHOULD BE REMOVED IN SEPERATE CLASS
        public void saveToFile(String filename) {
	// Creates a file with given name and writes the invoice
    }
    */

}
