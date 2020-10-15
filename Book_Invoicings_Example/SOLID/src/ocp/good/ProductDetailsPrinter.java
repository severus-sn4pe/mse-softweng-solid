package ocp.good;

public class ProductDetailsPrinter {
	public void PrintDetailsOf(IProduct product) {
		System.out.println(product.GetDetails());
	}
}
