package org.purplejacket.multimodule;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.Socket;

/**
 * Hello world!
 *
 */


public class App 
{
    public void sendUserFile(Socket sock, String user) throws UnsupportedEncodingException, IOException {
        BufferedReader filenameReader = new BufferedReader(
                new InputStreamReader(sock.getInputStream(), "UTF-8"));
        String filename = filenameReader.readLine();
        // BAD: read from a file using a path controlled by the user
        BufferedReader fileReader = new BufferedReader(
                new FileReader("/home/" + user + "/" + filename));
        String fileLine = fileReader.readLine();
        while(fileLine != null) {
            sock.getOutputStream().write(fileLine.getBytes());
            fileLine = fileReader.readLine();
        }
    }
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
