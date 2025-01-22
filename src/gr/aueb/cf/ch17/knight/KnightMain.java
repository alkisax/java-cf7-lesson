package gr.aueb.cf.ch17.knight;

public class KnightMain {
    private final static Runnable joa = new Knight("joa");
    private final static Runnable whiteKnight = new Knight ("whiteKnight");
    private final static Runnable saintGeogre = new Knight ("saintGeorge");

    public static void main(String[] args) {
        (new Thread(joa)).start();
        (new Thread(whiteKnight)).start();
        (new Thread(saintGeogre)).start();
    }
}
