public class Slip12a {
    public static void main(String[] args) {
        // Sample string array
        String[] stringArray = {"Hello", "World", "Java", "Programming"};

        // Iterate through the array and display each string in reverse order
        for (String str : stringArray) {
            String reversedString = reverseString(str);
            System.out.println(reversedString);
        }
    }

    // Method to reverse a string
    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }
}
