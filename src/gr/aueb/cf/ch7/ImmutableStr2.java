package gr.aueb.cf.ch7;

public class ImmutableStr2 {
    public static void main(String[] args) {
        String s1 = "coding";
        String s2 = "coding";

        s2 = "factory"; // s1 anchengable
        s1 = "athens";
    }
}
