package lsp.all;

public class AudioBook implements IProduct {
    public String name, author;
    public Duration duration;

	@Override
	public String getDetails() {
		return name + " " + "by " + author + ". "
			+ "Duration: " + duration.toString();
	}
}

public class EBook implements IProduct {
	public String name, author, fileSizeInMB;
	public int numberOfPages;
	
	@Override
	public String getDetails() {
		return name + " " + "by " + author + ". "
			+ numberOfPages + " pages. " + "Download size: " + fileSizeInMB + "MB.";
	}
}