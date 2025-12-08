package com.tesco.exception.multicatch;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MultiCatchDemo {
    public static void main(String[] args) {
//        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
//            String line;
//            while ((line = br.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch (FileNotFoundException e) {
//            System.out.println(e.getMessage());
//        } catch (IOException io) {
//            System.out.println(io.getMessage());
////        }
//        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
//            String line;
//            while ((line = br.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
//            String line;
//            while ((line = br.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }
    }
}
