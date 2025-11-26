public class Car {
    //state
    String name;
    int speed;

    //behaviour //methods
    void start() {
        System.out.println(name + " Started");
    }

    void acclerate(int increment) {
        speed += increment;
        System.out.println("Speed is now : " + speed);
    }

    void stop() {
        speed = 0;
        System.out.println(name + " Stopped");
    }
}
