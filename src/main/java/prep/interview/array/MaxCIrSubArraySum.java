package prep.interview.array;

public class MaxCIrSubArraySum {
    public static void main(String[] args) {
        int[] arr = {8, -8, 9, -9, 10, -11, 12};
        int n = arr.length;;
        int res = arr[0];

        for(int i = 0; i < n; i++) {
            int currSum = 0;
            for(int j = 0; j < n; j++) {
                int cirInx = (i + j) % n;
                currSum = currSum + arr[cirInx];
                res = Math.max(res, currSum);
            }
        }
        System.out.println(res);
    }
}
