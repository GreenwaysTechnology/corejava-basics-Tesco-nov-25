package com.tesco.exception;

public class ClassCastExceptionDemo {
    public static void main(String[] args) {
//        Object o = 10; //new Integer(10)
//        System.out.println((String) o);
        try {
            Object o = 10; //new Integer(10)
            System.out.println((String) o);
        } catch (ClassCastException e) {
            //print exception message
            //System.out.println(e.getMessage());
            //e.printStackTrace();
            System.out.println(e.getLocalizedMessage());
        }

    }
}
