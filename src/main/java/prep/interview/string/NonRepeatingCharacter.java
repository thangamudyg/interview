package prep.interview.string;

public class NonRepeatingCharacter{
    public static void main(String[] args) {
        String str = "finaclejava";
        int[] charCount = new int[256]; // Assuming ASCII character set

        // Count occurrences of each character
        for (char c : str.toCharArray()) {
            charCount[c]++;
        }

        // Find the first non-repeating character
        for (char c : str.toCharArray()) {
            if (charCount[c] == 1) {
                System.out.println("First non-repeating character: " + c);
                return;
            }
        }

        System.out.println("No non-repeating character found.");
    }

}
