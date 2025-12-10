package org.tesco.networking;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPAddress {
    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getByName("www.google.com");
            System.out.println(ip.getHostAddress());
        } catch (UnknownHostException e) {
            System.out.println(e.getCause());
        }
    }
}
