package gr.aueb.cf.ch6;

public class ArraySearch {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        final int SECRET = 4;
        boolean isFound = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == SECRET) {
                isFound = true;
                break;
            }
        }
        if (isFound) {
            System.out.println("secret found");
        } else {
            System.out.println("not found");
        }
    }


}
