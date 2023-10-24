public class Slip17a {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java Slip17a <number1> <number2> <number3> ...");
            return;
        }

        int n = args.length;
        int[] numbers = new int[n];
        int armstrongCount = 0;

        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(args[i]);
            if (isArmstrongNumber(numbers[i])) {
                armstrongCount++;
            }
        }

        int[] armstrongNumbers = new int[armstrongCount];
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (isArmstrongNumber(numbers[i])) {
                armstrongNumbers[index] = numbers[i];
                index++;
            }
        }

        System.out.println("Armstrong numbers in the array:");

        for (int armstrongNumber : armstrongNumbers) {
            System.out.print(armstrongNumber + " ");
        }
    }

    public static boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;
        int digitCount = String.valueOf(number).length();

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digitCount);
            number /= 10;
        }

        return sum == originalNumber;
    }
}
