// A) Write a java program to accept a number from user, if it zero then throw user
// defined Exception “Number Is Zero, otherwise calculate the sum of first and last digit
// of that number. (Use static keyword).
import java.util.Scanner;

class NumberIsZeroException extends Exception {
    public NumberIsZeroException(String message) {
        super(message);
    }
}

public class Slip6a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        try {
            if (number == 0) {
                throw new NumberIsZeroException("Number Is Zero");
            } else {
                int sum = sumOfFirstAndLastDigit(number);
                System.out.println("Sum of the first and last digit: " + sum);
            }
        } catch (NumberIsZeroException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        finally{
            scanner.close();
        }

    }

    // Function to calculate the sum of the first and last digit of a number
    public static int sumOfFirstAndLastDigit(int num) {
        int lastDigit = num % 10;
        int firstDigit = Character.getNumericValue(Integer.toString(num).charAt(0));
        return firstDigit + lastDigit;
    }
}
