package com.tesco.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) {

        String location = "G:/Tesco/ioApp/src/main/resources/config.txt";
        try {
            FileInputStream fileInputStream = new FileInputStream(location);
            int data;
            while ((data = fileInputStream.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (FileNotFoundException e) {
            System.out.print(e.getMessage());
        } catch (IOException io) {
            System.out.println(io.getMessage());
        }
    }
}
