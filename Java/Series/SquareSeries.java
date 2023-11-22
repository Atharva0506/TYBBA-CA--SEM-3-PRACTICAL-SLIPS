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
