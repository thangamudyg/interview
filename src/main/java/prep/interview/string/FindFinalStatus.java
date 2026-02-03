package prep.interview.string;

public class FindFinalStatus {
    public static void main(String[] args) {
        String input ="on-hold";
        String lastPart = input.substring(input.lastIndexOf(";") + 1); // "on-hold"
        System.out.println(lastPart);
    }
}
