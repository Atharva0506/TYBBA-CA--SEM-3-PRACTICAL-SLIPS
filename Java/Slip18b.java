import java.io.*;

public class Slip18b {
    public static void main(String[] args) {
        String sourceFileName = "input.txt";
        String targetFileName = "output.txt";

        try {
            
            FileReader fileReader = new FileReader(sourceFileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            FileWriter fileWriter = new FileWriter(targetFileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            int charRead;
            while ((charRead = bufferedReader.read()) != -1) {
                char ch = (char) charRead;
                char modifiedChar;

             
                if (Character.isUpperCase(ch)) {
                    modifiedChar = Character.toLowerCase(ch);
                } else if (Character.isLowerCase(ch)) {
                    modifiedChar = Character.toUpperCase(ch);
                } else {
                    modifiedChar = ch;
                }

                if (Character.isDigit(ch)) {
                    modifiedChar = '*';
                }
                bufferedWriter.write(modifiedChar);
            }


            bufferedReader.close();
            bufferedWriter.close();

            System.out.println("successfully!!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
