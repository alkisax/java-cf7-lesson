package gr.aueb.cf.ch14.services;

public class HelloUtil {
    /**
     * No instances of this class should be available.
     * can be called from main without creating an instance of that class.
     */
    private HelloUtil () {

    }

    public static void sayHello(){
        System.out.println("Hello Coding!");
    }
}
