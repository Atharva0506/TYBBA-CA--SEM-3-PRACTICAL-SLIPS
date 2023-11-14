import java.io.*;
import java.util.*;

public class Slip1b {
    public static void main(String[] args) {
        File inputFile = new File("input.txt");
        File outputFile = new File("output.txt");

        try {
            Scanner sc = new Scanner(inputFile);
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile, true));

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                if (line.matches(".*\\d.*")) {
                    continue;
                } else {
                    writer.write(line);
                    writer.newLine();  
                    System.out.println("Content Written: " + line);
                }
            }

            writer.close();
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
