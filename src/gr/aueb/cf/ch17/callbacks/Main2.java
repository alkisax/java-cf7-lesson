package gr.aueb.cf.ch17.callbacks;

public class Main2 {
    public static void main(String[] args) {
        doPrint(() -> System.out.println("Hello world"));

        doPrint(() -> System.out.println("Hello coding"));

    }

    public static void doPrint(Printable printable) {
        printable.print();
    }
}
