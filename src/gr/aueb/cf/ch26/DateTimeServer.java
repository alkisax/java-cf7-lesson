package gr.aueb.cf.ch26;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class DateTimeServer extends Thread { // βάλαμε thread για να μπορεί να συνεχίζει να τρέχει ενώ εξυπηρετεί κάποιο επισκέπτη

    @Override
    public void run() { // αυτό μπήκε με alt ins για το thread
        ServerSocket servFd;
        int serverPort = 13; // σε αυτό το πορτ είπαμε είναι wellknown για datetime

        try {
            servFd = new ServerSocket(); // file descriptor των ports τους συμπεριφερόμαστε σαν να είναι αρχείο
            servFd.bind(new InetSocketAddress("127.0.0.1", serverPort), 100); // δεύτερη παράμετρος, μπορεί να δεχτεί μέχρι 100 packets (to default ειναι 50)

            while (true) { // για πάντα δηλαδή
                Socket connectedFd = servFd.accept(); // κάθε φορά που έρχετε μια σύνδεση φτιάχνουμε ένα εφήμερο socket για την εξυπηρέτηση
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(connectedFd.getOutputStream()));
                bw.write(new Date().toString()); // εδώ γράφει στο output
                bw.flush(); // αυτό το στέλνει (αλλιώς θα περίμενε να γεμίσει)
                connectedFd.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}