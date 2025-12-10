package org.tesco.networking.tcp;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(5000);
            System.out.println("TCP Server is started!...");
            //start tcp server
            Socket socket = serverSocket.accept();
            //read message send by client
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            String message = dataInputStream.readUTF();
            System.out.println("Client says: " + message);
            serverSocket.close();
            socket.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
