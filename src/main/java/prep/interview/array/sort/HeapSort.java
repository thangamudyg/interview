package prep.interview.array.sort;

public class HeapSort {
    public static void main(String[] args) {

        int[] arr = {18, 28, 2, 7, 90, 1};
        int n = arr.length;
        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            maxHeapify(arr, n, i);
        }
        System.out.println("################ After heapify ################");
        for (int i : arr ){
            System.out.println(i);
        }
        heapSort(arr, n);
        System.out.println("################ After sort ################");
        for (int i : arr ){
            System.out.println(i);
        }
    }

    private static void heapSort(int arr[], int n) {
        // Heap sort
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            // Heapify root element
            maxHeapify(arr, i, 0);
        }
    }
    private static void maxHeapify(int arr[], int size, int currentIndex) {
        // Find largest among root, left child and right child
        int largest = currentIndex;
        int leftChild = 2 * currentIndex + 1;
        int rightChild = 2 * currentIndex + 2;
        if (leftChild < size && arr[leftChild] > arr[largest]) {
            largest = leftChild;
        }
        if (rightChild < size && arr[rightChild] > arr[largest]) {
            largest = rightChild;
        }
        // Swap and continue heapifying if root is not largest
        if (largest != currentIndex) {
            int swap = arr[currentIndex];
            arr[currentIndex] = arr[largest];
            arr[largest] = swap;
            maxHeapify(arr, size, largest);
        }
    }

}
