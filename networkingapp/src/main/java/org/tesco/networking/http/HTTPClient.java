package org.tesco.networking.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HTTPClient {
    public static void main(String[] args) {
        //read data from the rest end point
        try {
            URL url = new URL("https://jsonplaceholder.typicode.com/posts");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            //read Data
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            connection.disconnect();
        } catch (MalformedURLException e) {
            System.out.println("URL Exception :: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("HttpURLConnection Exception :: " + e.getMessage());
        }
    }
}
