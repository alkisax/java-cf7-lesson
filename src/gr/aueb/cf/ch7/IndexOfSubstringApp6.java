package gr.aueb.cf.ch7;

public class IndexOfSubstringApp6 {
    public static void main(String[] args) {
        String cf = "coding factory";
        int positionOfo = cf.indexOf("o");
        int positionOfSecondo = cf.indexOf("o", 2);
        int lastPostionOfo = cf.lastIndexOf("o");

        String cf2 = cf.substring(1);
        String cf3 = cf.substring( 1, 3);// od
    }
}
