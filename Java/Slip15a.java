import java.util.Scanner;

public class Slip15a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sample array of names
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve"};

        System.out.print("Enter the name to search: ");
        String searchName = scanner.nextLine();

        int index = searchName(names, searchName);

        if (index != -1) {
            System.out.println("Name found at index " + index);
        } else {
            System.out.println("Name not found in the array.");
        }
        scanner.close();
    }

    public static int searchName(String[] array, String name) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(name)) {
                return i;
            }
        }
        return -1; 
    }
}
