package lsp;

public class Main {
    static ElectricCar electricCar = new ElectricCar();
    static MotorCar motorCar = new MotorCar();

    public static void main(String[] args) {

        System.out.println("MotorCar: \n");
        motorCar.turnOnEngine();
        motorCar.accelerate();

        System.out.println("\n");

        System.out.println("ElectricCar: \n");
        electricCar.turnOnEngine();
        electricCar.accelerate();
    }
}
