package prep.interview.string;

import java.util.*;

public class Permutation {
    public static void main(String[] args) {
        String str = "ABCDE";
        int n = str.length();
        permute(str, 0, n - 1);
    }

    private static void permute(String str, int l, int r)
    {
        if (l == r)
            System.out.println(str);
        else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r);
                str = swap(str, l, i);
            }
        }
    }
    private static String swap (String s, int i, int j) {
        char[] charTmp = s.toCharArray();
        char tmp = charTmp[i];
        charTmp[i] = charTmp[j];
        charTmp[j] = tmp;
        return String.valueOf(charTmp);
    }
}
