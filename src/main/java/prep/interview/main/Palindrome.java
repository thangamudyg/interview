package prep.interview.main;

public class Palindrome {
    public static void main(String[] args) {
        int num = 121;
        int tmp = num;
        int rev = 0;
        while(tmp > 0) {
            rev = rev * 10 + tmp % 10;
            tmp /= 10;
        }
        System.out.println(num == rev ? "Palindrome" : "Not Palindrome");
    }
}
