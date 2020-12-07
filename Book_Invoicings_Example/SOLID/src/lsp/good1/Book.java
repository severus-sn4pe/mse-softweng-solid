package lsp.good1;

public abstract class Book implements IProduct {
	public String name;
	public String author;
	public int numberOfPages;

	@Override
	public String getDetails() {
		var details = name + " "
		+ "by " + author + ". ";
		if(hasPages()){
			details += numberOfPages + " pages. ";
		}
		return details + getSpecificDetails();
	}

	public abstract String getSpecificDetails();

	public abstract boolean hasPages();
}
