package prep.interview.array;

public class TripletSum {
    public static void main(String[] args) {
        int arr[] = { 0, -1, 2, -3, 1 };
        int n = arr.length;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int sum = arr[i] + arr[j] + arr[k];
                    if(sum == 0) {
                        System.out.println(arr[i] + " , " + arr[j] + " , " +arr[k]);
                    }
                }
            }
        }
    }
}
