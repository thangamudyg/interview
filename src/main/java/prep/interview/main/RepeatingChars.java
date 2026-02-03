package prep.interview.main;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RepeatingChars {

    public static void main(String[] args) {
        String input = "baseball";
        List<Character> repeating = input.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet()
                .stream()
                .filter( e -> e.getValue() >= 2)
                .map(Map.Entry :: getKey)
                .collect(Collectors.toList());

        System.out.println("Repeating characters: " + repeating);
    }
}
