package com.tesco.exception;

import java.util.Scanner;

public class ExceptionOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 10;
        System.out.println("Enter  value: ");
        int value = sc.nextInt();
        int j = i / value;
        System.out.println("J :" + j);
    }
}
