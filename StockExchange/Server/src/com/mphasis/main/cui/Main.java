package com.mphasis.main.cui;

import com.sun.jdi.IntegerValue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;

class Node {
    public int clientId;
    public String messageType;
    public String orderType;
    public int orderId;
    public double price;


    public Node() {

    }

    public Node(int clientId, String messageType, String orderType, int orderId, double price) {
        this.clientId = clientId;
        this.messageType = messageType;
        this.orderType = orderType;
        this.orderId = orderId;
        this.price = price;
    }

}
class enumType {
    public enum connectionType {EXEC, FEED}


}
class OrderBook{
     ConcurrentMap<Double,LinkedList<Node>> orderBook = new ConcurrentSkipListMap<>();

}

public class Main {



    private static class ClientHandler implements Runnable {
        private Socket clientSocket;

        // Constructor
        public ClientHandler(Socket socket) {
            this.clientSocket = socket;
        }

        public void run() {
            PrintWriter out = null;
            BufferedReader in = null;
            try {

                // get the outputstream of client
                out = new PrintWriter(
                        clientSocket.getOutputStream(), true);

                // get the inputstream of client
                in = new BufferedReader(
                        new InputStreamReader(
                                clientSocket.getInputStream()));

                String line;

                while ((line = in.readLine()) != null) {

                    Node node = new Node();
                    String[] order = line.split("\\|");
                    // writing the received message from


                    // Node node = new Node() ;


                    node.clientId = Integer.valueOf(order[0]);


                    node.messageType = order[1];


                    node.orderType = order[2];

                    node.orderId = Integer.valueOf(order[3]);

                    node.price = Double.valueOf(order[4]);

                    System.out.println(node.clientId);
                    System.out.println(node.messageType);
                    System.out.println(node.orderType);
                    System.out.println(node.orderId);
                    System.out.println(node.price);


                    System.out.printf(
                            " Sent from the client: %s\n",
                            line);
                    out.println(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (out != null) {
                        out.close();
                    }
                    if (in != null) {
                        in.close();
                        clientSocket.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        // write your code here
        ServerSocket server = null;



        try {

            // server is listening on port 1234
            server = new ServerSocket(1234);
            server.setReuseAddress(true);

            // running infinite loop for getting
            // client request
            while (true) {

                // socket object to receive incoming client
                // requests
                Socket client = server.accept();

                // Displaying that new client is connected
                // to server
                System.out.println("New client connected"
                        + client.getInetAddress()
                        .getHostAddress());

                // create a new thread object
                ClientHandler clientSock
                        = new ClientHandler(client);

                // This thread will handle the client
                // separately
                new Thread(clientSock).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (server != null) {
                try {
                    server.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
