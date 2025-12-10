package org.tesco.fp;

public class GreeterMain {
    public static void main(String[] args) {
        Greeter greeter = null;
        greeter = new GreeterImpl();
        greeter.sayGreet();
        //anonymous inner class
        greeter = new Greeter() {
            @Override
            public void sayGreet() {
                System.out.println("Greeter Anonymous");
            }
        };
        greeter.sayGreet();
    }
}
