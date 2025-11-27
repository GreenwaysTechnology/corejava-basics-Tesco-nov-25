package com.tesco.oo.lang.object.wrapperclasses;

public class StringDemo {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.chars().max().getAsInt());

        //how to equals two strings
        String name = "Subramnaian";
        String anotherName = "Subramanian";
        if (name == anotherName) {
            System.out.println("two Strings are equal");
        } else {
            System.out.println("two Strings are equal");
        }
        if (name.equalsIgnoreCase(anotherName)) {
            System.out.println("two Strings are equal");
        } else {
            System.out.println("two Strings are equal");
        }

    }
}
