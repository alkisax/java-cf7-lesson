package gr.aueb.cf.ch13;


import java.sql.SQLOutput;

/**
 * defines a {@link Account} class.
 */
public class Account {
    private int id;
    private String iban;
    private String firstname;
    private String lastname;
    private String ssn;
    private double balance;

    public Account() {
    }

    public Account(int id, String iban, String firstname, String lastname, String ssn, Double balance) {
        this.id = id;
        this.iban = iban;
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    /*
     *  public API
     */

    /**
     * Deposits a certain amount of money.
     * @param amount    the amount of money to be deposited.
     * @throws Exception if the amount is negative.
     */
    public void deposit (double amount) throws Exception{
        try {
            if (amount < 0) {
                throw new Exception("The amount must not be negative");
            }
            balance += amount;
            System.out.println("Amount " + amount + " successfully deposited");
        } catch (Exception e) {
            System.err.println("Error. Amount" + amount + " can not be negative");
            e.printStackTrace();
            throw e;
        }
    }

    public void withdraw (double amount, String ssn) throws Exception{
        try {
            if (!isSsnValid(ssn)) {
                throw new Exception("SSN " + ssn + " is not valid");
            }
            if (amount > balance) {
                throw new Exception("Insufficient balance " + balance +  " for amount " + amount);
            }
            if (amount < 0) {
                throw new Exception("The amount must not be negative");
            }
            balance -= amount;
            System.out.println("Amount " + amount + " successfully withdrew");
        } catch (Exception e) {
            System.err.println("Error. " + e.getMessage());
            e.printStackTrace();
            throw e;
        }
    }

    private boolean isSsnValid (String ssn) {
        return this.ssn.equals(ssn);
    }
}
