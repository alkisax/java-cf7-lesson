package gr.aueb.cf.ch7;

public class StrTraverse5 {
    public static void main(String[] args) {
        String s =  "Codnig Factory";
        for (int i = 0; i < s.length(); i++){
            System.out.print(s.charAt(i) + " ");
        }
        for (int i = s.length() - 1; i < 0; i--){
            System.out.print(s.charAt(i) + " ");
        }
    }
}
