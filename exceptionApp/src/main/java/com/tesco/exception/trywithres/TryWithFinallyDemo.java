package com.tesco.exception.trywithres;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithFinallyDemo {
    public static void main(String[] args) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("data.txt");
            BufferedReader br = new BufferedReader(fileReader);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        } finally {
            try {
                //in order to avoid memory leaks the close method must be called
                fileReader.close();
                System.out.println("File has been closed");
            } catch (IOException es) {
                System.out.println("Inside finally");
            }

        }
    }
}
