package prep.interview.array.sort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {18, 28, 2, 7, 90, 1};
        int n = arr.length;
        System.out.println("################ selection sort ################");
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n ; j++) {
                if( arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int minIndexValue = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = minIndexValue;

        }
        for (int i : arr ){
            System.out.println(i);
        }
    }
}
