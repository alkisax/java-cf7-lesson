package gr.aueb.cf.ch12;

public class StudentDemo {
    public static void main(String[] args) {
        Student student = new Student();                                   // default constructor
        Student bob = new Student(2, "Bob", "D.");  // Invoke Overloaded Constructs and populate instance

        bob.setLastname("Dylan");

        student.setId(1);
        student.setFirstname("Alice");
        student.setLastname("w.");

//        System.out.println("id: " + student.id);
//        System.out.println("first name: " + student.firstname);
//        System.out.println("last name: " + student.lastname);

        System.out.println("Id: " + student.getId());
        System.out.println("Firstname: " + student.getFirstname());
        System.out.println("Lastname: " + student.getLastname());

        System.out.println("Id: " + bob.getId());
        System.out.println("Firstname: " + bob.getFirstname());
        System.out.println("Lastname: " + bob.getLastname());


        System.out.println("Student instances' count: " + Student.getStudentsCount()); // den κάλεσε με στιγμιοτυπο .  αλλα κλαση .
        
    }
}
