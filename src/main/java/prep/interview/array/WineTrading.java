package prep.interview.array;

import java.util.Scanner;

public class WineTrading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfHouses = scanner.nextInt();
        int[] house = new int[noOfHouses];
        for (int i = 0; i < noOfHouses; i++) house[i] = scanner.nextInt();

        long balance = 0L;
        long work = 0L;
        for (int j = 0; j < noOfHouses; j++) {
            balance += house[j];
            work += Math.abs(balance);
        }
        System.out.println(work);
        scanner.close();
    }
}
