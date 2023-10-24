import java.util.Scanner;

class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

public class Slip29a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter candidate's age: ");
            int age = scanner.nextInt();
            checkEligibility(age);
        } catch (AgeException e) {
            System.err.println("Age Exception: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("System Exception: " + e.getMessage());
        }
    }

    public static void checkEligibility(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Candidate is not eligible for voting. Age is less than 18.");
        } else {
            System.out.println("Candidate is eligible for voting.");
        }
    }
}
