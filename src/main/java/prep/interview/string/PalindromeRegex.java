package prep.interview.string;

public class PalindromeRegex {
    public static void main(String[] args) {
        String str = "amanaplanacanalpanama";
        String regex = "(?i)^(.?)(.?)(.?)(.?)(.?)\\4\\3\\2\\1$|(?i)^(.?)(.?)(.?)(.?)\\4\\3\\2$|(?i)^(.?)(.?)(.?)\\3\\2$|(?i)^(.?)(.?)\\2$|(?i)^(.?)$|^$";
        boolean isPalindrome = str.matches(regex);
        System.out.println(isPalindrome ? "Palindrome" : "Not Palindrome");
        System.out.println(str.equals(new StringBuilder(str).reverse().toString()) ? "Palindrome" : "Not Palindrome");
    }
}
