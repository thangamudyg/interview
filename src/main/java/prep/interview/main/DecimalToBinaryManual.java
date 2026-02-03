package prep.interview.main;

public class DecimalToBinaryManual {
    public static void main(String[] args) {
        int n = 42;
        convertDecimalToBinary(n);
        System.out.println("\n");
        long binaryNumber = 0, reminder, i = 1;
        while(n != 0) {
            reminder = n % 2;
            n /= 2;
            binaryNumber += reminder * i;
            i *= 10;
        }
        System.out.println(binaryNumber);

    }

    public static void convertDecimalToBinary(int n) {
        if (n > 0) {
            convertDecimalToBinary(n / 2); // Recurse with the quotient
            System.out.print(n % 2);       // Print the remainder after the recursion returns
        }
    }
}
