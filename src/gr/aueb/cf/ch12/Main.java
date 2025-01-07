package gr.aueb.cf.ch12;

import gr.aueb.cf.ch12.model.*;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Teacher teacher = new Teacher(1, "Athanasios", "Androutsos");
        User user = new User(1, "Kostas", "Mask", "cmask", "12345", true);
//        User User2 = new User()
        Customer customer = new Customer(1, "Andrew", "dimitrioy", "876543289", "6947733075", "Athens", "Attica", "Athens", "Patission", "76", "10434");
        Point point = new Point(0, 10);
        Order order = new Order(1, 5.5, "Meat", "ordered");

        System.out.printf("point {%d, %d}\n", point.getX(), point.getY());
        System.out.println("teacher full name: " + teacher.getFirstname() + ", " + teacher.getLastname());
        System.out.println("User username: " + user.getUsername());
        System.out.println("Customer  Vat: " + customer.getVatRegistretionNo());
        System.out.println("Order Timestamp" + order.getFormatedTimestamp());


    }
}
