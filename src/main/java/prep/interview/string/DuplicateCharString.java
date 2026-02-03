package prep.interview.string;

public class DuplicateCharString {
    public static void main(String[] args) {
        String s = "finacleeea";
        int[] freq = new int[256];
        for (char c : s.toCharArray()) {
            freq[c]++;
        }
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 1) {
                System.out.println((char)i + " : " + freq[i]);
            }
        }
    }
}
