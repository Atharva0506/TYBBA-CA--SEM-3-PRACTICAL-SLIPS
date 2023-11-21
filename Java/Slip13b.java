import java.util.Scanner;

public class Slip13b {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter User Name: ");
      String name = sc.next();
      System.out.println("Hello, "+ name.toUpperCase() +", nice to meet you!");

      sc.close();  
    }
}
