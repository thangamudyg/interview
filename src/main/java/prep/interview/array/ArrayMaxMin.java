package prep.interview.array;

public class ArrayMaxMin {
    public static void main(String[] args) {
        int[] arr = {18, 28, 3, 4, 7, 45, 90, 1};
        Integer max = Integer.MIN_VALUE;
        Integer min = Integer.MAX_VALUE;
        for(int i : arr) {
            Integer val = Integer.valueOf(i);
            min = Math.min(min, val);
            max = Math.max(max, val);
        }

        //System.out.println(second(arr));
        //find k largest number
        //find the mid
        int k = 3;
        while(min <= max) {
            int mid = min  + (max - min) /2;
            int count = 0;
            for(int i : arr) {
                if(i > mid) {
                   count++;
                }
            }
            if(count >= k){
                min = mid + 1;
            } else {
                max = mid -1;
            }
        }
        System.out.println(Math.max(max, min));

    }

    public static int second(int arr[]) {
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
