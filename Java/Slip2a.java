// A) Write a java program to display all the vowels from a given string

import java.util.Scanner;
public class Slip2a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.println("Vowels in the input string:");

        inputString = inputString.toLowerCase();

        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if (isVowel(ch)) {
                System.out.print(ch + " ");
            }
        }

        scanner.close();
    }

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
