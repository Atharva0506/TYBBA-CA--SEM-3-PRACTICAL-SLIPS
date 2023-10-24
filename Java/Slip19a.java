public class Slip19a {
    public static void main(String[] args) {
        int n = 10; 

        System.out.println("Fibonacci Series:");
        for (int i = 0; i < n; i++) {
            int fibonacciNumber = fibonacci(i);
            System.out.print(fibonacciNumber + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
