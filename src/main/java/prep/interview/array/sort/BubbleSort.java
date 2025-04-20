package prep.interview.array.sort;

public class BubbleSort {
    public static void main(String[] args) {
        //bubble sort
        int[] arr = {18, 28, 2, 7, 90, 1};
        int n = arr.length;
        BubbleSort sort = new BubbleSort();
        sort.bubbleSort(arr, n);
        for (int i : arr ){
            System.out.println(i);
        }
    }

    public void bubbleSort( int[] arr, int n){
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                int temp = arr[j];
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
