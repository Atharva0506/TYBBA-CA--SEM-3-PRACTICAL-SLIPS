import java.util.Scanner;

public class Slip18a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Choose a shape to calculate the area:");
            System.out.println("1. Circle");
            System.out.println("2. Triangle");
            System.out.println("3. Rectangle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the radius of the circle: ");
                    double radius = scanner.nextDouble();
                    System.out.println("Area of the circle: " + calculateCircleArea(radius));
                    break;
                case 2:
                    System.out.print("Enter the base of the triangle: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter the height of the triangle: ");
                    double height = scanner.nextDouble();
                    System.out.println("Area of the triangle: " + calculateTriangleArea(base, height));
                    break;
                case 3:
                    System.out.print("Enter the length of the rectangle: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter the width of the rectangle: ");
                    double width = scanner.nextDouble();
                    System.out.println("Area of the rectangle: " + calculateRectangleArea(length, width));
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        } while (choice != 4);
    }

    public static double calculateCircleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }
}
