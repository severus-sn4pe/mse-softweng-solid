package lsp.good1;

public class EBook extends Book {
	public String fileSizeInMB;
	
	@Override
	public String getSpecificDetails() {
		return "Download size: " + fileSizeInMB + "MB.";
	}

	@Override
	public boolean hasPages() {
		return true;
	}
}
