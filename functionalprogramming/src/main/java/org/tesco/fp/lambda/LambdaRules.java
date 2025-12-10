package org.tesco.fp.lambda;

public class LambdaRules {
    public static void main(String[] args) {
        Welcome welcome = ()-> {
            System.out.println("hai");
        };
        welcome.sayHello();
        welcome.saySomething();
        Welcome.doSomething();
    }
}
