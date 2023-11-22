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
