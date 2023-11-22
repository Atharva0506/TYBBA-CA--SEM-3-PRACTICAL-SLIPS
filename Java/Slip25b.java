/*
  package Series;

public class FibonacciSeries {
    public static void generateSeries(int n) {
        int firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci Series:");

        for (int i = 0; i < n; i++) {
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        System.out.println("\n---------------------");
    }
}


package Series;

public class CubeSeries {
    public static void generateSeries(int n) {
        System.out.println("Cube Series:");

        for (int i = 1; i <= n; i++) {
            int cube = i * i * i;
            System.out.print(cube + " ");
        }

        System.out.println("\n---------------------");
    }
}


package Series;

public class SquareSeries {
    public static void generateSeries(int n) {
        System.out.println("Square Series:");

        for (int i = 1; i <= n; i++) {
            int square = i * i;
            System.out.print(square + " ");
        }

        System.out.println("\n---------------------");
    }
}

 */
import Series.FibonacciSeries;
import Series.CubeSeries;
import Series.SquareSeries;

public class Slip25b {
    public static void main(String[] args) {
        int n = 10; 
 
        FibonacciSeries.generateSeries(n);
        CubeSeries.generateSeries(n);
        SquareSeries.generateSeries(n);
    }
}
