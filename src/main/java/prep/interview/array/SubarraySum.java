package prep.interview.array;

public class SubarraySum {
    public int[] subarraySum(int[] nums, int k) {
        int[] subArr = {-1, -1};
        int size = nums.length;
        int i = 0;
        int j = i + 1;
        int sum = nums[i];
        while (i < size && j < size) {
            sum += nums[j];
            if (sum == k) {
                subArr[0] = i;
                subArr[1] = j;
                break;
            } else {
                j++;
            }
            if (j >= size) {
                i++;
                j = i + 1;
                sum = nums[i];
            }
        }
        return subArr;
    }

    public static void main(String[] args) {
        SubarraySum subarraySum = new SubarraySum();
        int[] subArr = subarraySum.subarraySum(new int[]{16, 13, 24, 32, 21, 48, 4, 9}, 53);
        System.out.println(subArr[0] + "," + subArr[1]);
    }
}
