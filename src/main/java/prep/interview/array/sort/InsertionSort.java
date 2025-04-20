package prep.interview.array.sort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {18, 28, 2, 7, 90, 1};
        int n = arr.length;
        System.out.println("################ insertion sort ################");
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        for (int i : arr ){
            System.out.println(i);
        }
    }
}
