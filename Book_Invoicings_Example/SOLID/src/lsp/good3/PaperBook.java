package lsp.good3;

import java.awt.Rectangle;

public class PaperBook extends Book {
	public Rectangle sizeInMm;
	public int numberOfPages;
	
	@Override
	public String getSpecificDetails() {
		return numberOfPages + " pages. "
		+ "Ships as paper book with size (LxW) " + sizeInMm.height + "x" + sizeInMm.width;
	}
}
