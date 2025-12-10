package org.tesco.fp.builtinfunctions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class BuiltInInterfaces {
    public static void main(String[] args) {
        Supplier<String> supplier = null;
        supplier = new Supplier<String>() {
            @Override
            public String get() {
                return "Hello";
            }
        };
        System.out.println(supplier.get());
        supplier = () -> "Hello";
        System.out.println(supplier.get());

        Consumer<String> consumer = (value) -> System.out.println(value);
        consumer.accept("Consumer");

        //built in apis uses lambda and method references
        List<String> names = Arrays.asList("Subramanian", "Geetha", "Divya Sree");
        //for loop
        for (String name : names) {
            System.out.println(name);
        }
        names.forEach((value) -> {
            System.out.println(value);
        });
        names.forEach(System.out::println);


    }
}
