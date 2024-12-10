package gr.aueb.cf.ch6;

public class ArraysAsCollections {
    public static void main(String[] args) {

    }
    public static int[]getEvens(int[] arr){
        int count = 0;
        for (int el: arr){
            if (el % 2 == 0) { count++; }
        }

        int pivot = 0;
        int[] evens = new int[count];
        for (int el: arr) {
            if (el % 2 == 0) {
                evens[pivot++] = el;
                // anti gia evens[pivot] = el; pivot++;
                // το ι++ πρωτα καταχωρείτε και μετα αυξάνει. το αντίθετο είναι ++ι
            }
        }
        return evens;
    }

    public static int[] mapToDouble(int[] arr) {
        int[] doubleArr = new int[arr.length];

        int pivot = 0;
        for (int el: arr) {
            doubleArr[pivot] = el * 2;
            pivot++;
        }
        return doubleArr;
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int el: arr){
            sum += el;
        }
        return sum;
    }

    public static double avg(int[] arr) {

        if (arr.length <= 0) { return -1; }
        int sum = sum(arr);
        double avg = (double) sum / arr.length;
        return avg;
    }

    public static boolean anyEven (int[] arr) {
        boolean isAnyEven = false;
        for (int el: arr) {
            if (el % 2 == 0) {
                isAnyEven = true;
                break;
            }
        }
        return isAnyEven;
    }
    public static boolean moreThanTwoEvens(int[] arr) {
        int count = 0;

        for (int el : arr) {
            if (el % 2 == 0) count++;
        }

        return count > 2;
    }

    public static boolean moreThanTwoConsecutive(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] == arr[i+1] - 1 && arr[i] == arr[i+2] - 2) {
                count++;
                break;
            }
        }
        return count >= 1;
    }
    public static boolean moreThanTwoWithSameEnding(int[] arr) {
        int[] endings = new int[10];
        boolean isSameEnding = false;

        for (int num : arr) {
            endings[num % 10]++;
        }
        //        for (int i = 0; i < arr.length; i++) {
//            endings[arr[i] % 10]++;
//        }

        for (int count : endings) {
            if (count >= 3) {
                isSameEnding = true;
                break;
            }
        }
        return isSameEnding;
    }


    public static boolean moreThanTwoSameDec (int[] arr) {
        int count = 0;
        int[] dec = new int[arr.length];
        boolean hasMore = false;

        for (int i = 0; i < arr.length; i++) {
            dec[i] = arr[i] / 10;
        }
        for (int i: dec) {
            for (int el: dec) {
                if (i == el) {
                    count++;
                }
            }
        }
        if (count > 2) { hasMore = false; }
        return hasMore;
    }

    public static boolean allAreEven(int[] arr) {

//        return getEvens(arr).length == arr.length;
        boolean allEven =false;
        int count = 0;
        for (int el: arr) {
            if (el % 2 == 0) {count++;}
        }
        return count == arr.length;

    }
}
