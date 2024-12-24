package gr.aueb.cf.ch12.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class Order {
    private int id;
    private String uuid;
    private double amount;
    private String discription;
    private String state;
    private LocalDateTime timestamp;
    private String formatedTimestamp;


    public Order() {

    }
// αφαίρεσα διαφορα και τα αλλαξα απο το defult
    public Order(int id, double amount,
                 String discription, String state) {
        this.id = id;
        this.amount = amount;
        this.discription = discription;
        this.state = state;
        this.uuid = UUID.randomUUID().toString();
        this.timestamp = LocalDateTime.now();
        this.formatedTimestamp = this.timestamp.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getFormatedTimestamp() {
        return formatedTimestamp;
    }

    public void setFormatedTimestamp(String formatedTimestamp) {
        this.formatedTimestamp = formatedTimestamp;
    }
}
