package extends1.ex2;

public class CarMain {

    static int num = 10;

    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();


        System.out.println("static int num = "+num);
    }



}
