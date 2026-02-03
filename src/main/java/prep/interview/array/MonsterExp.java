package prep.interview.array;

import java.util.Arrays;
import java.util.Scanner;

public class MonsterExp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfMonster = scanner.nextInt();
        int initialExp = scanner.nextInt();
        int[] power = new int[numberOfMonster];
        int[] bonus = new int[numberOfMonster];
        for (int i = 0; i < numberOfMonster; i++) power[i] = scanner.nextInt();
        for (int j = 0; j < numberOfMonster; j++) bonus[j] = scanner.nextInt();
        //sort the array
        Arrays.sort(power);
        Arrays.sort(bonus);
        int currentExp = initialExp;
        int defeatCount = 0;
        //find the power and bonus to get defeat count;
        for (int i = 0; i < numberOfMonster; i++) {
            if (currentExp >= power[i]) {
                currentExp = currentExp + bonus[i];
                defeatCount++;
            } else {
                //stop
                break;
            }
        }
        // Output: Total monsters defeated
        System.out.println(defeatCount);
        scanner.close();
    }
}
