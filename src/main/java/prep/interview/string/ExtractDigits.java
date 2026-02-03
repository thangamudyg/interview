package prep.interview.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractDigits {
    public static void main(String[] args) {
       String input = "Call me at +1 (123) 456-7890!";
        // Remove all non-digit characters
        String phoneNumber = input.replaceAll("\\D", "");

        System.out.println("Extracted: " + phoneNumber);
        Pattern pattern = Pattern.compile("(\\d{10})$");
        Matcher matcher = pattern.matcher(phoneNumber);

        if (matcher.find()) {
            System.out.println("Extracted: " + matcher.group());
        }
    }
}
