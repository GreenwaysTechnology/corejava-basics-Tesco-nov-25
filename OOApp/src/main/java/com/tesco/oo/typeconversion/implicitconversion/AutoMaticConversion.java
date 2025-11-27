package com.tesco.oo.typeconversion.implicitconversion;

public class AutoMaticConversion {
    public static void main(String[] args) {
        byte b = 10;
        //byte is converted into short auotmatically
        short s = b;
        System.out.println("B" + b + "S:" + s);
        int i = b;

        //here you get compiltime error; why because 10.5 its type is double by default
        //  float f = 10.5;
        double d = 10.5;
        //        long a = d;
    }
}
