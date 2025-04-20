package prep.interview.array;

public class SpiralPrint {
    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        int inputSize = a.length;
        int tmpSize = a.length;
        int depthTopCounterIndex = 0;
        int depthRightCounterIndex = 1;
        int depthLeftCounterIndex = 0;

        while (tmpSize > 0) {
            // array top
            int[] top = a[inputSize - tmpSize];
            for(int i = inputSize - tmpSize; i < top.length - 1; i++) {
                System.out.println(top[i]);
            }

            // array right
            for(int i = depthRightCounterIndex; i < tmpSize ; i++) {
                System.out.println(a[i][tmpSize - 1]);
            }
            // array bottom
            int[] bottom = a[tmpSize - 1];
            for(int i = tmpSize - 2; i >= depthLeftCounterIndex ; i--) {
                System.out.println(bottom[i]);
            }
            // array left
            for(int i = tmpSize - 2; i > 0 ; i--) {
                System.out.println(a[i][depthLeftCounterIndex]);
            }
            tmpSize--;
            depthTopCounterIndex++;

            depthRightCounterIndex++;

            depthLeftCounterIndex++;
        }

    }
}
