package org.tesco.networking.tcp;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) {
        try {
            Socket client = new Socket("localhost",5000);
            DataOutputStream outputStream = new DataOutputStream(client.getOutputStream());
            outputStream.writeUTF("Hello Server!, I am from client");
            client.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
