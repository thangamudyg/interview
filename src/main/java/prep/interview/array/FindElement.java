package prep.interview.array;

public class FindElement {
    public static void main(String[] args) {
        int mat[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };
        int x = 20;
        int n = mat.length;
        int i = 0, j = n - 1;
        while(i < n && j >= 0) {
            if(mat[i][j] == x) {
                System.out.print("Element found at " + i
                        + " " + j);
                return;
            }
            if (mat[i][j] > x)
                j--;
            else
                i++;
        }
    }
}
