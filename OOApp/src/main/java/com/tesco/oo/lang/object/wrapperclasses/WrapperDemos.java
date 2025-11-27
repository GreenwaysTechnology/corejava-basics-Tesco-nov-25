package com.tesco.oo.lang.object.wrapperclasses;

public class WrapperDemos {
    public static void main(String[] args) {
//        Integer i = new Integer(100);
        //i is reference variable, Integer is Reference type
        //100 is primitve value, how this 100 is converted into Wrapper
        //Boxing
        Integer i = 100;
        System.out.println(i.longValue());

        Integer a = 100;
        //Reference to Primitive: Unboxing
        int b = a;

    }
}
