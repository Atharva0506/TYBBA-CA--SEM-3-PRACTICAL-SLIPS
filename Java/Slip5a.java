// A) Write a java program to display following pattern:
// 5
// 4 5
// 3 4 5
// 2 3 4 5
// 1 2 3 4 5 

public class Slip5a {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        // Loop through each row
        for (int i = 1; i <= n; i++) {
            // Loop to print numbers in each row
            for (int j = n - i + 1; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
