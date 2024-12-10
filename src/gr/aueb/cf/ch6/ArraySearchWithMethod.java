package gr.aueb.cf.ch6;

public class ArraySearchWithMethod {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int position;
        position = getPosition(arr, 5);
        if (position == -1) {
            System.out.println("did not fount");
        } else {
            System.out.println(position);
        }

    }
    public static int getPosition(int[] arr, int value){
        int positionToReturn = -1;
        for (int i = 0; i <arr.length; i++){
            if (arr[i] ==value) {
                positionToReturn = i;
                break;
            }
        }
        return positionToReturn;
    }
}
