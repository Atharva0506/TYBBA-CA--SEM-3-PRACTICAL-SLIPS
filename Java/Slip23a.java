import java.io.File;

public class Slip23a {
    public static void main(String[] args) {
        String filePath = "input.txt";  // Replace with the path of the file you want to check

        File file = new File(filePath);

        if (file.exists()) {
            if (file.isHidden()) {
                System.out.println("The file is hidden.");
            } else {
                System.out.println("File path: " + file.getAbsolutePath());
            }
        } else {
            System.out.println("The file does not exist.");
        }
    }
}
