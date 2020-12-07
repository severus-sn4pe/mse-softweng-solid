package lsp.good2;

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
