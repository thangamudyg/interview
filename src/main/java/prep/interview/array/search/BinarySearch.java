package prep.interview.array.search;

import prep.interview.array.sort.BubbleSort;

/*
Time Complexity:
Best Case: O(1)
Average Case: O(log N)
Worst Case: O(log N)
Auxiliary Space: O(1), If the recursive call stack is considered then the auxiliary space will be O(logN).
 */
public class BinarySearch {
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
        System.out.println(findIndexValue(arr, 0, n - 1,56));
        System.out.println(binarySearch(arr, n - 1,56));
    }

    private static int findIndexValue(int[] arr, int l, int r, int value) {
        if (l <= r) {
            int mid = l + (r - l)  / 2;
            if (arr[mid] == value)
                return mid;
            if(value < arr[mid]) {
                return findIndexValue(arr, 0, mid - 1, value);
            }
            return findIndexValue(arr, mid + 1, r, value);
        }
       return -1;
    }

    /*
    Time Complexity: O(log N)
    Auxiliary Space: O(1)
 */
    private static int binarySearch(int[] arr, int n, int value) {
        int l = 0;
        int r = n-1;
        while(l <= r) {
            int mid = l + (r-l)/2;
            if(value == arr[mid]) return mid;
            if(value > arr[mid]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }
}
