package lsp.all;

public class AudioBook implements IProduct {
    public String name;
	public String author;
    public Duration duration;

	@Override
	public String getDetails() {
		return name + " "
		+ "by " + author + ". "
		+ "Duration: " + duration.toString();
	}
}

public class EBook implements IProduct {
	public String name;
	public String author;
	public int numberOfPages;
	public String fileSizeInMB;
	
	@Override
	public String getDetails() {
		return name + " " 
		+ "by " + author + ". "
		+ numberOfPages + " pages. "
		+ "Download size: " + fileSizeInMB + "MB.";
	}
}