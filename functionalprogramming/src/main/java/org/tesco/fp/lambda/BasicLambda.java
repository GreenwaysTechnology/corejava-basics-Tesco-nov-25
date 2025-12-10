package org.tesco.fp.lambda;

;

public class BasicLambda {
    public static void main(String[] args) {
        Greeter greeter = null;
        //way 1: using legacy way: inner class.

        greeter = new Greeter() {
            @Override
            public void sayGreet() {
                System.out.println("This is greeter");
            }
        };
        greeter.sayGreet();
        //way 2: lambda syntax: java 8 style
        //() is method args
        //-> is separator
        //{} is method body where we can write logic
        greeter = () -> {
            System.out.println("Greet Lambda");
        };
        greeter.sayGreet();

        //Threads implemenation
        Thread thread = null;
        thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        });
        thread.start();

        //via lambda
        Runnable runnable = () -> {
            System.out.println(Thread.currentThread().getName());
        };
        thread = new Thread(runnable);
        thread.start();
        thread = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
        });
        thread.start();
    }
}
