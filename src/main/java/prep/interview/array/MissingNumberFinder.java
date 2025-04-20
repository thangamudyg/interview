package prep.interview.array;

public class MissingNumberFinder {
    public static int findMissingNumber(int[] arr, int n) {
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] numbers = {13, 5, 4, 10, 7, 11, 1, 9, 12, 8, 2, 6};
        int missingNumber = findMissingNumber(numbers, 12);
        System.out.println("The missing number is: " + missingNumber);
    }
}