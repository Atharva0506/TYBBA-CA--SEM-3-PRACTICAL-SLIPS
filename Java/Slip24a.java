import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Slip24a {
    public static void main(String[] args) {
        String fileName = "input.txt";  // Replace with the path to your file

        int charCount = 0;
        int digitCount = 0;
        int spaceCount = 0;

        try (FileReader fileReader = new FileReader(fileName);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            int c;
            while ((c = bufferedReader.read()) != -1) {
                charCount++;

                if (Character.isDigit(c)) {
                    digitCount++;
                } else if (Character.isWhitespace(c)) {
                    spaceCount++;
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
            System.exit(1);
        }

        System.out.println("Character count: " + charCount);
        System.out.println("Digit count: " + digitCount);
        System.out.println("Space count: " + spaceCount);
    }
}
