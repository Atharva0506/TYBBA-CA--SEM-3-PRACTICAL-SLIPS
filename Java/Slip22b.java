import java.io.File;
import java.io.IOException;

public class Slip22b {

    public static void main(String[] args) {
      
        String fileName = "input.txt";

        createFile(fileName);
        displayFilePath(fileName);
        String newFileName = "NewFile.txt";
        renameFile(fileName, newFileName);
        displayFilePath(newFileName);
        deleteFile(newFileName);
    }

 
    private static void createFile(String fileName) {
        try {
            File file = new File(fileName);

            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }

    private static void displayFilePath(String fileName) {
        File file = new File(fileName);
        System.out.println("Path of the file '" + fileName + "': " + file.getAbsolutePath());
    }

    private static void renameFile(String oldFileName, String newFileName) {
        File oldFile = new File(oldFileName);
        File newFile = new File(newFileName);

        if (oldFile.renameTo(newFile)) {
            System.out.println("File renamed successfully.");
        } else {
            System.out.println("Failed to rename the file.");
        }
    }

    private static void deleteFile(String fileName) {
        File file = new File(fileName);

        if (file.delete()) {
            System.out.println("File deleted: " + fileName);
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}

