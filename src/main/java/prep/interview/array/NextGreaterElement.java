package prep.interview.array;

import java.util.Arrays;

public class NextGreaterElement {
    public static void main(String[] args) {
        int arr[] =  {1, 3, 2, 4, 0};
        int n = arr.length;
        int next, i, j;
        for (i = 0; i < n; i++) {
            next = -1;
            for (j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    next = arr[j];
                    break;
                }
            }
            System.out.println(arr[i] + " -- " + next);
        }
    }
}
