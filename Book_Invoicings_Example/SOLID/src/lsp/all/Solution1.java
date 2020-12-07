package lsp.all;

public abstract class Book implements IProduct {
	public String name;
	public String author;
	public int numberOfPages;

	@Override
	public String getDetails() {
		var details = name + " "
		+ "by " + author + ". ";
		if(hasPages()){ //This will fix the problem for now.
			details += numberOfPages + " pages. ";
		}
		return details + getSpecificDetails();
	}

	public abstract String getSpecificDetails();

	public abstract boolean hasPages();
}

public class AudioBook extends Book {
    public Duration duration;

    @Override
    public String getSpecificDetails() {
        return "Duration: " + duration.toString();
    }

    @Override
    public boolean hasPages() {
        return false;
    }
}