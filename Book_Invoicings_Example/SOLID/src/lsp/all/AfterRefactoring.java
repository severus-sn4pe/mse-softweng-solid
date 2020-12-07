package lsp.all;

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

public class EBook extends Book {
    public String fileSizeInMB;

    @Override
    public String getSpecificDetails() {
        return "Download size: " + fileSizeInMB + "MB.";
    }
}

public class PaperBook extends Book {
	public Rectangle sizeInMm;
	
	@Override
	public String getSpecificDetails() {
		return "Ships as paper book with size (LxW) " + sizeInMm.height + "x" + sizeInMm.width;
	}
}