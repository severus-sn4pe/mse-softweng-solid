package lsp.good2;

import java.awt.Rectangle;

public class PaperBook implements IProduct {
	public String name;
	public String author;
	public int numberOfPages;
	public Rectangle sizeInMm;

	@Override
	public String getDetails() {
		return name + " " 
		+ "by " + author + ". "
		+ numberOfPages + " pages. "
		+ "Ships as paper book with size (LxW) " + sizeInMm.height + "x" + sizeInMm.width;
	}
}
