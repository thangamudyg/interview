package prep.interview.array;

import java.util.Arrays;

public class FindMissingNumbers {
    public static void main(String[] args) {
        int[] numbers = {10, 13, 12, 8};
        //sort the array
        Arrays.sort(numbers);
        int count = 0;
        //find the next number is equal to current number by adding 1.
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] + 1 != numbers[i + 1]) {
                for (int j = numbers[i] + 1; j < numbers[i + 1]; j++) {
                    System.out.println("missing number " + j);
                    count++;
                }
            }
        }

        System.out.println("number of missing numbers " + count);
    }
}
