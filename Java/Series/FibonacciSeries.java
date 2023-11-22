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
