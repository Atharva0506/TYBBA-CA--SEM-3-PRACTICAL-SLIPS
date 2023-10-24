import java.io.*;


public class Slip21a {
    public static void main(String[] args) {
        String fileName = "input.txt"; // Hardcoded file name

        try (FileReader fileReader = new FileReader(fileName);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split(" ");
                for (String word : words) {
                    String reversedWord = reverseWord(word);
                    System.out.print(reversedWord + " ");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }

    public static String reverseWord(String word) {
        char[] wordChars = word.toCharArray();
        int left = 0;
        int right = wordChars.length - 1;

        while (left < right) {
            char temp = wordChars[left];
            wordChars[left] = wordChars[right];
            wordChars[right] = temp;

            left++;
            right--;
        }

        return new String(wordChars);
    }
}
