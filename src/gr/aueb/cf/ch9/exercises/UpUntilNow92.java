package gr.aueb.cf.ch9.exercises;

import java.io.*;
import java.util.UUID;

public class UpUntilNow92 {
    public static void main(String[] args) {

        int nextByte;
        byte[] buffer = new byte[8192];

        String path = "src/gr/aueb/cf/ch9/exercises/simpleCat.jpg";
        String outPath = "src/gr/aueb/cf/ch9/exercises/";

        File image = new File(path);
        File outFile = new File(outPath);

        String randomOutPath = outPath + UUID.randomUUID().toString().replace(":", "_") + image.getName();


        try (
                FileInputStream inStrm = new FileInputStream(path);
                FileOutputStream outStrm = new FileOutputStream(randomOutPath);
        ){
//            while ((nextByte = inStrm.read()) != -1) { //διαβάζει byte byte και σταματά οταν βρεί αρνητική τιμή (δηλ δεν έχει άλλα byte το αρχείο)
//                outStrm.write(nextByte);

            while ((nextByte = inStrm.read(buffer)) != -1) {
                outStrm.write(buffer, 0, nextByte);
            }
            System.out.println("copied!");

        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("ERROR");
        }
    }
}
