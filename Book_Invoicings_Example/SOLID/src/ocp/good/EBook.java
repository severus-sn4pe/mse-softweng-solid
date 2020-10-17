package ocp.good;

public class EBook implements IProduct {
	public String name;
	public String author;
	public String fileSizeInMB;
	
	@Override
	public String GetDetails() {
		return name + " " 
		+ "by " + author + ". "
		+ "Download size: " + fileSizeInMB + "MB.";
	}
}
