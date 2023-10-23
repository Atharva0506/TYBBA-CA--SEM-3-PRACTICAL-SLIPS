// A) Write a java program to display alternate character from a given string.
import java.util.Scanner;
public class Slip4a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.println("Alternate characters in the input string:");

        for (int i = 0; i < inputString.length(); i += 2) {
            char ch = inputString.charAt(i);
            System.out.print(ch);
        }

        scanner.close();
    }
}
