package srp;

// DATA CLASS
// Defining Book class to use for the invoicings

class Book {
	String name;
	String authorName;
	int year;
	float price;
	String isbn;
 
	public Book(String name, String authorName, int year, float price, String isbn) {
		this.name = name;
		this.authorName = authorName;
		this.year = year;
        this.price = price;
		this.isbn = isbn;
	}
}
