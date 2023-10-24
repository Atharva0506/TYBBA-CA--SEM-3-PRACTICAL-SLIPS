public class Slip28a {
    public static void main(String[] args) {
        int count = 0;
        
        for (String arg : args) {
            try {
                int number = Integer.parseInt(arg);
                count++;
            } catch (NumberFormatException e) {
                // Ignore non-integer arguments
            }
        }

        System.out.println("Number of integers in the list: " + count);
    }
}
