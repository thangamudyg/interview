package prep.interview.array;

import java.util.HashSet;
import java.util.Set;

public class Matrix90Degrees {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int n = matrix.length;
        int sum = 11;
        //shift value
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }

        //swap the row
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = tmp;
            }
        }
        for (int[] x : matrix) {
            System.out.println("\n");
            for (int y : x)
                System.out.println(y);
        }
        System.out.println(isPairWithSum(matrix, 11));
    }

    public static boolean isPairWithSum(int[][] matrix, int targetSum) {
        Set<Integer> seenElements = new HashSet<>();
        for (int[] x : matrix) {
            for (int y : x) {
                if (seenElements.contains(targetSum - y)) {
                    System.out.println("Pair found: (" + (targetSum - y) + ", " + y + ")");
                    //return true;
                }
                seenElements.add(y);
            }
        }
        return false;
    }
}
