package prep.interview.array.circular;

public class CircularArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int n = arr.length;
        int startIndex = 0; // Start at element '30'

        // Print 7 elements starting from index 2, wrapping around
        for (int i = 0; i < 7; i++) {
            int circularIndex = (startIndex + i) % n;
            System.out.print(arr[circularIndex] + " ");
        }
        // Output: 30 40 50 10 20 30 40
        System.out.print("\n");
        //transform(arr);
        ModularXorSum(arr);
        System.out.print("\n");
       // long[] arr2 = {10, 20, 30, 40, 50};
       // xORRoundsSolver(n, 5, arr2);
    }

    //CircularXOR
    public static void transform(int[] arr) {
        int n = arr.length;
        if (n == 0) return;

        // Save the first element to XOR with the last later
        int first = arr[0];
        for (int i = 0; i < n; i++) {
            // XOR current element with the next circular element
            int nextVal = (i == n - 1) ? first : arr[i + 1];
            arr[i] = arr[i] ^ nextVal;
        }
        // Print
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

    }

    static void xORRoundsSolver(int n, int k, long[] arr) {
        // Handle edge case where no rounds are performed
        if (k == 0) return;

        // Binary decomposition: Process K as a sum of powers of 2
        for (int p = 0; p < 31; p++) {
            // Check if the p-th bit of k is set
            if (((k >> p) & 1) == 1) {
                long[] nextArr = new long[n];
                int shift = (1 << p) % n;

                for (int i = 0; i < n; i++) {
                    // Find neighbors at distance 2^p in a cyclic array
                    int leftIdx = (i - shift + n) % n;
                    int rightIdx = (i + shift) % n;

                    // Apply XOR transformation for 2^p rounds
                    nextArr[i] = arr[i] ^ arr[leftIdx] ^ arr[rightIdx];
                }
                // Update arr to the state after this power-of-2 transformation
                arr = nextArr;
            }
        }
        // Print
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }


    public static void ModularXorSum(int[] arr) {
        int n = arr.length;
        long MOD = 10^9 + 7L;
        long totalSum = 0;

        for (int i = 0; i < n; i++) {
            // (A + B) % M = ((A % M) + (B % M)) % M
            long xorValue = arr[i] ^ i; // Calculate B[i] XOR i
            totalSum = (totalSum + xorValue) % MOD;
        }
        System.out.println("Result: " + totalSum);
    }

}
