package lsp;

public class ElectricCar implements Car {
	 
    public void turnOnEngine() {
	    throw new AssertionError("I don't have an engine!");
    }

    public void accelerate() {
        System.out.println("Electric Car is accelerating.");
    }
}
