package prep.interview.array.search;

import prep.interview.array.sort.BubbleSort;

public class FibonacciSearch {
    public static void main(String[] args) {
        int[] arr = {18, 28, 2, 7, 90, 1, 12,4,81, 54, 56, 577, 333};
        int n = arr.length;
        //lets sort array
        BubbleSort sort = new BubbleSort();
        sort.bubbleSort(arr, n);
        System.out.println("################ After sort ################");
        for (int i : arr ){
            System.out.println(i);
        }
        System.out.println(fibSearch(arr, n, 28));

    }

    public static int fibSearch(int arr[], int n, int x){
        /* Initialize fibonacci numbers */
        int fm2 = 0; // (m-2)'th Fibonacci No.
        int fm1 = 1; // (m-1)'th Fibonacci No.
        int fm = fm2 + fm1; // m'th Fibonacci

        /* fibM is going to store the smallest
        Fibonacci Number greater than or equal to n */
        while (fm < n) {
            fm2 = fm1;
            fm1 = fm;
            fm = fm2 + fm1;
        }
        // Marks the eliminated range from front
        int offset = -1;
        while(fm > 1){
            int i = Math.min(offset + fm2, n - 1);
            if (arr[i] < x) {
                fm = fm1;
                fm1 = fm2;
                fm2 = fm - fm1;
                offset = i;
            } else if (arr[i] > x) {
                fm = fm2;
                fm1 = fm1 - fm2;
                fm2 = fm - fm1;
            } else {
                return i;
            }
        }
        /* comparing the last element with x */
        if (fm1 == 1 && arr[n-1] == x)
            return n-1;
        return -1;
    }
}
