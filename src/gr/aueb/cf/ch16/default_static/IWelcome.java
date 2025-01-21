package gr.aueb.cf.ch16.default_static;

public interface IWelcome {
    static void staticMethod(){
        System.out.println("hello form IWelcome static method");
    }
    default void defaultMethod(){
        System.out.println("default method from IWelcome");
    }
}
