// A) Write a java program to count the frequency of each character in a given string.

public class Slip10a {

    public static void main(String[] args) {
        String inputString = "Breed";
        int[] letterFrequency = new int[26]; // assuming only lowercase letters are to be counted

        // Removing non-alphabetic characters and converting to lowercase
        String formattedString = inputString.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Counting the frequency of each letter
        for (int i = 0; i < formattedString.length(); i++) {
            char c = formattedString.charAt(i);
            if (c >= 'a' && c <= 'z') {
                letterFrequency[c - 'a']++;
            }
        }

        // Printing the frequencies
        System.out.println("Letter frequencies in the string: " + inputString);
        for (int i = 0; i < 26; i++) {
            if (letterFrequency[i] > 0) {
                char c = (char) (i + 'a');
                System.out.println("Letter: " + c + ", Frequency: " + letterFrequency[i]);
            }
        }
    }
}
