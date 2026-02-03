package prep.interview.array;

import java.util.*;

public class MissingKeyboard {
    public static int missingKeyboards(int[] arr) {
        //sort the array
        Arrays.sort(arr);
        int n = arr.length;
        int firstSerial = arr[0];
        int lastSerial = arr[n - 1];
        return lastSerial - firstSerial + 1 - n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = scanner.nextInt();

        int result = missingKeyboards(arr);
        System.out.println(result);
        scanner.close();
    }
}
