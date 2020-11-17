package lsp;

public class MotorCar implements Car {
	 
    private Engine engine = new Engine();

    //Constructors, getters + setters

    public void turnOnEngine() {
        //turn on the engine!
        engine.on();
        System.out.println("MotorCar: Engine activated.");
    }

    public void accelerate() {
        //move forward!
        engine.powerOn(1000);
    }
}
