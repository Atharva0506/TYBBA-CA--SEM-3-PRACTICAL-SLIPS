// A) Write a java Program to display following pattern:
// 1
// 0 1
// 0 1 0
// 1 0 1 0 
public class Slip9a {
    public static void main(String[] args) {
        int n = 4; // Number of rows

        for (int i = 1; i <= n; i++) {
            int numToPrint = (i % 2 == 1) ? 1 : 0; // Initialize the first number

            for (int j = 1; j <= i; j++) {
                System.out.print(numToPrint + " ");
                numToPrint = 1 - numToPrint; // Toggle between 0 and 1
            }

            System.out.println(); // Move to the next line after each row
        }
    }
}
