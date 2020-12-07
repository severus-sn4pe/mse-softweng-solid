package lsp.good1;

import java.awt.Rectangle;

public class PaperBook extends Book {
	public Rectangle sizeInMm;
	
	@Override
	public String getSpecificDetails() {
		return "Ships as paper book with size (LxW) " + sizeInMm.height + "x" + sizeInMm.width;
	}

	@Override
	public boolean hasPages() {
		return true;
	}
}
