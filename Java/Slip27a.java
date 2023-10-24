import java.util.Scanner;

class NumberOutOfRangeException extends Exception {
    public NumberOutOfRangeException(String message) {
        super(message);
    }
}

public class Slip27a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            displayFactors(number);
        } catch (NumberOutOfRangeException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static void displayFactors(int number) throws NumberOutOfRangeException {
        if (number > 1000) {
            throw new NumberOutOfRangeException("Number is out of Range");
        } else {
            System.out.println("Factors of " + number + ":");
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
