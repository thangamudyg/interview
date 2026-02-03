package prep.interview.list;

import java.util.Arrays;
import java.util.List;

public class FindEvenNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        list.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}
