import java.util.Arrays;
import java.util.Scanner;

class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }
}

public class Slip16b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name for Employee " + (i + 1) + ": ");
            String name = scanner.nextLine();
            employees[i] = new Employee(name);
        }

        
        Arrays.sort(employees, (v1, v2) -> v1.name.compareToIgnoreCase(v2.name));

        // Display the sorted employee names
        System.out.println("\nSorted Employee Names:");

        for (int i = 0; i < n; i++) {
            System.out.println("Employee " + (i + 1) + ": " + employees[i].name);
        }

        scanner.close();
    }
}
