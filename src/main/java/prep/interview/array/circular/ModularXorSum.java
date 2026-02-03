package prep.interview.array.circular;

public class ModularXorSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int n = arr.length;
        long totalSum = 0;
        long MOD = 10 ^ 9 + 7L;
        for (int i = 0; i < n; i++) {
            int prev = arr[(i - 1 + n) % n];
            int next = arr[(i + 1) % n];
            int absValue = Math.abs(prev - next);
            int xorValue = absValue ^ i;
            System.out.println("xorValue: " + xorValue);
            totalSum = (totalSum + xorValue) % MOD;
        }
        System.out.println("Result: " + totalSum);
    }
}
