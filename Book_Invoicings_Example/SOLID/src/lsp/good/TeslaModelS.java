package lsp.good;

public class TeslaModelS implements ElectricCar {

    @Override
    public void charge() {
        // charge battery!
        System.out.println("Battery has been charged.");
    }
    
    @Override
    public void turnOnBattery() {
        // turn on battery!
	    System.out.println("Battery is turned on.");
    }

    @Override
    public void accelerate() {
        //move forward!
        System.out.println("Electric Car is accelerating.");
    }


}
