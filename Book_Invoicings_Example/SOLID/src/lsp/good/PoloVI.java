package lsp.good;

public class PoloVI implements MotorCar {
	 
    private Engine engine = new Engine();

    @Override
    public void refuel() {
        // refuel tank!
        System.out.println("Tank has been refueled.");
    }

    @Override
    public void turnOnEngine() {
        //turn on the engine!
        engine.on();
        System.out.println("Engine is turned on.");
    }

    @Override
    public void accelerate() {
        //move forward!
        engine.powerOn(1000);
        System.out.println("Car is accelerating.");
    }
}
