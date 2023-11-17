import java.util.Scanner;

public class Slip14a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();

        double result = calculatePower(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is " + result);
        scanner.close();
    }

    public static double calculatePower(double base, int exponent) {
        if (exponent == 0) {
            return 1; // Any number raised to the power of 0 is 1
        } else if (exponent < 0) {
            return 1 / (base * calculatePower(base, -exponent - 1));
        } else {
            return base * calculatePower(base, exponent - 1);
        }
    }
}
