
import java.util.Scanner;
public class Slip6b {
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter The number of Rows And Colums Of Arrray");
        int rows= sc.nextInt();
        int cols = sc.nextInt();
        int [][] arr = new int[rows][cols];

        System.out.println("ENter Array");
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++){
                System.out.println("Ent Array Element:"+i+" "+j);
                int num = sc.nextInt();
                arr[i][j] = num;
            }
            System.out.println("");
        }
        display(arr);

        
        System.out.println("Transpose of Matrix is: ");
        transpose(arr);
        
        sc.close();
     }
     static void display(int[][] arr){
        System.out.println("Array Is:");
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
     }
     static void transpose(int[][] arr){
        int rows = arr.length;
        int cols = arr[0].length;

        int[][] transposeMatrix = new int[cols][rows];
        for (int i=0; i<rows; i++){
            for(int j=0; j<cols;j++){
                transposeMatrix[j][i] = arr[i][j];
            }
        }
        display(transposeMatrix);
    }
}