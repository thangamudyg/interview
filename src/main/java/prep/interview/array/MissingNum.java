package prep.interview.array;

import java.util.Arrays;

public class MissingNum {
    public static int findMissingNumber(int[] arr) {
        int k = 0;
        int j = 0;
        for (int i = 1; i < arr.length + 1; i++) {
            k = k + i;
            j = j + arr[i - 1];
        }
        return (arr.length + 1) - (j - k);
    }

    public static void main(String[] args) {
        long n1 = System.nanoTime();
        int[] numbers = {3, 5, 4, 10, 7, 1, 9, 12, 8, 2, 6};
        int missingNumber = findMissingNumber(numbers);
        System.out.println("The missing number is: " + missingNumber);
        long n2 = System.nanoTime();
        System.out.println("The execution time: " + (n2 - n1));
        //1361625 or 1132500
    }
}
