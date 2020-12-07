package lsp.good3;

public abstract class Book implements IProduct {
	public String name;
	public String author;

	@Override
	public String getDetails() {
		return name + " "
		+ "by " + author + ". "
		+ getSpecificDetails();
	}

	public abstract String getSpecificDetails();
}
