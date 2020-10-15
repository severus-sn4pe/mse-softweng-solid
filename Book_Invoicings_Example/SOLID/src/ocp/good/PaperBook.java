package ocp.good;

import java.awt.Rectangle;

public class PaperBook implements IProduct {
	public String name;
	public String author;
	public Rectangle sizeInMm;
	
	@Override
	public String GetDetails() {
		return name + " " 
		+ "by " + author + ". "
		+ "Ships as paper book with size (LxW) " + sizeInMm.height + "x" + sizeInMm.width;
	}
}
