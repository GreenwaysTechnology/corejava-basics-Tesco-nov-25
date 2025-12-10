package org.tesco.fp.lambda.deep;

@FunctionalInterface
interface MyFunction {
    void sayHello();
}

@FunctionalInterface
interface Details {
    void setDetails(String value1, String value2);
}

@FunctionalInterface
interface Single {
    void setName(String name);
}

///
@FunctionalInterface
interface Stock {
    int getStock();
}

@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}

public class DeepLambdaRules {
    public static void main(String[] args) {
        MyFunction myFunction = null;
        myFunction = () -> {
            System.out.println("Say Hello");
        };
        myFunction.sayHello();
        //if function has only one line of code; remove {}
        myFunction = () -> System.out.println("Say Hello");
        myFunction.sayHello();
        //params and lambda
        Details details = null;
//        details = (String value1, String value2) -> {
//            System.out.println(value1 + " " + value2);
//        };
        details = (String value1, String value2) -> System.out.println(value1 + " " + value2);
        details.setDetails("Test1", "Test2");

        //even we can eleminate the data type: type inference: type of variable is understood
        details = (value1, value2) -> System.out.println(value1 + value2);
        details.setDetails("Value1", "Value2");

        //single parameter
        Single single = null;
        single = (String name) -> {
            System.out.println(name);
        };
        single.setName("Subramanian");
        //type inference
        single = (name) -> {
            System.out.println(name);
        };
        single.setName("Subramanian");
        //type inference with removing ()
        single = name -> {
            System.out.println(name);
        };
        single.setName("Subramanian");
        //////////Return values/////////////
        Stock stock = null;
        stock = () -> {
            return 100;
        };
        System.out.println(stock.getStock());
        //only return, no more body : remove {} and return statement
        stock = () -> 100;
        System.out.println(stock.getStock());

        //Input and output
        Calculator calculator = null;
        calculator = (a, b) -> {
            return a + b;
        };
        System.out.println(calculator.calculate(10, 20));
        calculator = (a, b) -> a + b;
        System.out.println(calculator.calculate(10, 20));

    }
}
