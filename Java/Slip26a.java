import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Slip26a {
    public static void main(String[] args) {
        String fileName = "input.txt";  // Replace with the path to your file

        try (FileReader fileReader = new FileReader(fileName);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            int c;
            while ((c = bufferedReader.read()) != -1) {
                System.out.println("Character: " + (char) c + ", ASCII Value: " + c);
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
            System.exit(1);
        }
    }
}
