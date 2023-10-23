// A) Write a ‘java’ program to check whether given number is Armstrong or not.
//  (Use static keyword)

public class Slip3a {
    public static void main(String[] args) {
        int number = 153; // Change this to the number you want to check

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    // Function to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int originalNumber = num;
        int numDigits = String.valueOf(num).length();
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numDigits);
            num /= 10;
        }

        return originalNumber == sum;
    }
}
