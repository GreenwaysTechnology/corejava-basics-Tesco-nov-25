package com.tesco.exception;

public class ArrayStoreExceptionDemo {
    public static void main(String[] args) {
        Object x[] = new String[3];
        x[0] = 10;
    }
}
