package prep.interview.array;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] sortedArr = {1, 1, 2, 2, 3, 4, 4};

        int i = 0;
        for (int j = 1; j < sortedArr.length; j++) {
            if (sortedArr[j] != sortedArr[i])
                i++;
            sortedArr[i] = sortedArr[j];
        }
        int[] newArr = new int[i + 1];
        for (int j = 0 ; j < i + 1; j++) {
            newArr[j] = sortedArr[j];
            System.out.println(newArr[j]);
        }
    }
}
