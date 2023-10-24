import java.util.Scanner;

class ZeroException extends Exception {
    public ZeroException(String message) {
        super(message);
    }
}

public class Slip30a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            String input = scanner.nextLine();
            checkNumber(input);
        } catch (ZeroException e) {
            System.err.println("Zero Exception: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Number is Invalid: " + e.getMessage());
        }
    }

    public static void checkNumber(String input) throws ZeroException {
        if (input.equals("0")) {
            throw new ZeroException("Number is Zero.");
        }

        try {
            int number = Integer.parseInt(input);

            if (isPalindrome(input)) {
                System.out.println("The number is a palindrome.");
            } else {
                System.out.println("The number is not a palindrome.");
            }
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Number is Invalid");
        }
    }

    public static boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
