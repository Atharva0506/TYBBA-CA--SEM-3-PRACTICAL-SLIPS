import java.util.Scanner;

public class Slip16a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        if (number < 0) {
            System.out.println("Please enter a non-negative number.");
        } else {
            int sum = calculateSumOfDigits(number);
            System.out.println("Sum of digits: " + sum);
        }
        scanner.close();
    }

    public static int calculateSumOfDigits(long number) {
        if (number == 0) {
            return 0; // Base case: when there are no more digits
        } else {
            return (int)(number % 10) + calculateSumOfDigits(number / 10);
        }
    }
}
