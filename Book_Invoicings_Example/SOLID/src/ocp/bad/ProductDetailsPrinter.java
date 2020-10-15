package ocp.bad;

public class ProductDetailsPrinter {
	public void PrintDetailsOf(IProduct product) {
		if(product instanceof PaperBook) {
			PaperBook paperBook = (PaperBook)product;
			System.out.println(paperBook.name + " " 
			+ "by " + paperBook.author + ". "
			+ "Ships as paper book with size (LxW) " + paperBook.sizeInMm.height + "x" + paperBook.sizeInMm.width);
		}else if(product instanceof EBook) {
			EBook eBook = (EBook)product;
			System.out.println(eBook.name + " " 
			+ "by " + eBook.author + ". "
			+ "Download size: " + eBook.fileSizeInMB + "MB.");
		}else {
			throw new IllegalArgumentException("Unknown product " + product.getClass().getName());
		}
	}
}
