package lsp.bad;

public class TeslaModelS implements Car {

    //Constructors, getters + setters

    @Override
    public void refuel() {
        throw new AssertionError("I cannot be refueled!");
    }
    
    @Override
    public void turnOnEngine() {
	    throw new AssertionError("I don't have an engine!");
    }

    @Override
    public void accelerate() {
        System.out.println("Electric Car is accelerating.");
    }
}
