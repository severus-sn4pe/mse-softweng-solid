package srp;

public class Book {
  public String name;
  public String authorName;
  public int year;
  public float price;
  public String isbn;

  public Book(String name, String authorName, int year, float price, String isbn) {
    this.name = name;
    this.authorName = authorName;
    this.year = year;
    this.price = price;
    this.isbn = isbn;
  }
}
