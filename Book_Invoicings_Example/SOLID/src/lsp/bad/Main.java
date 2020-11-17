package lsp.bad;

public class Main {
    
    static TeslaModelS tesla = new TeslaModelS();
    static PoloVI polo = new PoloVI();

    public static void main(String[] args) {

        System.out.println("MotorCar: \n");
        polo.turnOnEngine();
        polo.accelerate();

        System.out.println("\n");

        System.out.println("ElectricCar: \n");
        tesla.turnOnEngine();
        tesla.accelerate();
    }
}
