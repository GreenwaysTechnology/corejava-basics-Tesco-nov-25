package com.tesco.oo.typeconversion.explicitconversion;

public class ExplicitConversion {
    public static void main(String[] args) {
        int i = 10;
        short s = (short) i;
        System.out.println("I" + i + " S " + s);

        float price = (float) 10.5;
        //short cut for float conversion
        float totalPrice = 10.5f;

    }
}
