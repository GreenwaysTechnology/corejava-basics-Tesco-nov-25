public class CarMain {
    public static void main(String[] args) {
        Car car = new Car();
        car.name = "BMW";
        car.start();
        //4 parameter
        car.acclerate(4);
        car.acclerate(4);

        car.stop();

    }
}
