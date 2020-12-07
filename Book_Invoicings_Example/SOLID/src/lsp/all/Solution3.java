package lsp.all;

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

public class AudioBook extends Book {
    public Duration duration;

    @Override
    public String getSpecificDetails() {
        return duration.toString();
    }
}

public class EBook extends Book { //Maybe add another class BookWithPages
	public String fileSizeInMB;
	public int numberOfPages;
	
	@Override
	public String getSpecificDetails() {
		return numberOfPages + " pages. "
		 + "Download size: " + fileSizeInMB + "MB.";
	}
}