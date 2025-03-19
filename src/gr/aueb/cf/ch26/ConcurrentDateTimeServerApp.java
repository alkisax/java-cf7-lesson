package gr.aueb.cf.ch26;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ConcurrentDateTimeServerApp {

    private static final int PORT = 13;

    public static void main(String[] args) {

        try (ServerSocket servFd = new ServerSocket()) { // φτιάχνω σοκετ
            servFd.bind(new InetSocketAddress("127.0.0.1", PORT)); // του κάνω bind οτι χρειάζετε
            System.out.println("Datetime server has started ...");

            for (;;) { //  αυτό σημάινει για πάντα, σαν while(true)
                Socket connectedFd = servFd.accept(); // κάνει  accept το εισερχόμεντο
                Thread socketThread = new Thread(new ConcurrentDateTimeServer(connectedFd)); // και για κάθε ένα απο αυτα φτιάχνει ένα thread και του δίνει το connected
                socketThread.start();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}