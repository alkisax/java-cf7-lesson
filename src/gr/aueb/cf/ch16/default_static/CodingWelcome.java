package gr.aueb.cf.ch16.default_static;

public class CodingWelcome implements IWelcome{

    // OXI OVERRIDE ALLA HIDE
    public static void staticMethod(){
        System.out.println("static method from coding welcome hides IWelcome");
    }

    @Override
    public void defaultMethod() {
        System.out.println("Overriden");
        IWelcome.super.defaultMethod();
    }
}
