package lsp.good3;

public class EBook extends Book {
	public String fileSizeInMB;
	public int numberOfPages;
	
	@Override
	public String getSpecificDetails() {
		return numberOfPages + " pages. "
		 + "Download size: " + fileSizeInMB + "MB.";
	}
}
