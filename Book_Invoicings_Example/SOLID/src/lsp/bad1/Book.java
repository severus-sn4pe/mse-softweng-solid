package lsp.bad1;

public abstract class Book implements IProduct {
	public String name;
	public String author;
	public int numberOfPages;

	@Override
	public String getDetails() {
		return name + " "
		+ "by " + author + ". "
		+ numberOfPages + " pages. "
		+ getSpecificDetails();
	}

	public abstract String getSpecificDetails();
}
