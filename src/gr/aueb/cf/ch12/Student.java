package gr.aueb.cf.ch12;

/**
 * java bean
 * μια κλαση είναι bean όταν έχει -private πεδια -default constructor -geteres & setters με συμβαση + serializable
 */

public class Student {
    private int id;
    private String firstname;
    private String lastname;


    // ftiaxtikan ola me alt+insert
    // default constructor
    public Student() {
    }
    //overloaded constructor
    public Student (int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    //    //default constructor
//    public Student (){
//        id = 0;
//        firstname = null;
//        lastname = null;
//    }
//
//    public int getId() {
//        return this.id;
//    }
//
//    public void setId (int id) {
//        this.id = id;
//    }
//
//    public String getFirstname() {
//        return this.firstname;
//    }
//
//    public void setFirstname(String firstname) {
//        this.firstname = firstname;
//    }
//
//    public String getLastname() {
//        return this.lastname;
//    }
//
//    public void setLastname(String lastname) {
//        this.lastname = lastname;
//    }
}
