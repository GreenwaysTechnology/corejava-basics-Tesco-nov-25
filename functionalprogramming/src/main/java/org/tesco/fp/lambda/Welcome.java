package org.tesco.fp.lambda;


@FunctionalInterface
public interface Welcome {
    //abstract methods
    void sayHello();
//    void sayHai(); //IT wil throw error
    //default methods
    public default void saySomething() {
        System.out.println("i am saying something");
    }
    public default void saySomething1() {
        System.out.println("i am saying something");
    }

    //static methods
    public static void doSomething() {
        System.out.println("Do Something");
    }
    public static void doSomething1() {
        System.out.println("Do Something");
    }

}
