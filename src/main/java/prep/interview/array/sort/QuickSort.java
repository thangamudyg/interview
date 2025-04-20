package prep.interview.array.sort;

//Time Complexity:
//Best Case: Ω (N log (N))
//Average Case: θ ( N log (N))
//Worst Case: O(N2)
//Auxiliary Space: O(1)
//Advantage
 // 1. It is a divide-and-conquer algorithm that makes it easier to solve problems.
 // 2. It is efficient on large data sets.
 // 3. It has a low overhead, as it only requires a small amount of memory to function.
//Disadvantages
 //1. It has a worst-case time complexity of O(N2), which occurs when the pivot is chosen poorly.
 //2. It is not a good choice for small data sets.
 //3. it is not a stable sort, meaning that if two elements have the same key, their relative order
 //   will not be preserved in the sorted output in case of quick sort, because here we are swapping
 //   elements according to the pivot’s position (without considering their original positions).
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {18, 28, 2, 7, 90, 1, 12};
        int n = arr.length;
        System.out.println("################ quick sort ################");
        quickSort(arr, 0, n - 1 );

        for (int i : arr ){
            System.out.println(i);
        }
    }

    // low --> Starting index,
    // high --> Ending index
   private  static void quickSort(int[] arr, int low, int high)
    {

        // pi is partitioning index, arr[p]
        // is now at right place
        int pi = partition(arr, low, high);

        //if 'low' is less than pi - 1,
        //then the element(s) at left are to be sorted
        if(low < pi - 1)
        {
            quickSort(arr, low, pi - 1);
        }

        //if 'high' is greater than pi,
        //then the element(s) at right are to be sorted
        if(pi  < high)
        {
            quickSort(arr, pi, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        //taking pivot at the middle of the array
        int pivot = arr[(low + high)/2];
        while(low < high) {
            while(arr[low] < pivot) {
                low++;
            }
            while(pivot < arr[high]){
                high--;
            }
            if(low <= high){
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
        }
        return low;
    }
}
