package com.tesco.io;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStreamDemo {
    public static void main(String[] args) throws  IOException {
        //byte array as input source
        byte[] data = "Hello Java io".getBytes();
        //read data from the byte array
        ByteArrayInputStream input = new ByteArrayInputStream(data);
        //read data from the bytearray input stream
        int byteValue;
        while ((byteValue = input.read()) != -1) {
            System.out.print((char) byteValue);
        }
        //close method is throwing checked Excetion (java.io.IOException)
//        try {
//            input.close();
//        } catch (IOException ioException) {
//            System.out.println(ioException.getMessage());
//        }
        input.close();

    }
}
