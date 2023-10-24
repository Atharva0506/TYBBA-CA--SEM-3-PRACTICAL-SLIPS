public class Slip11a {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Usage: Calculator <operation> <operand1> <operand2>");
            return;
        }

        String operation = args[0];
        double operand1 = Double.parseDouble(args[1]);
        double operand2 = Double.parseDouble(args[2]);
        double result = 0;

        switch (operation) {
            case "1":
            case "add":
            case "addition":
                result = operand1 + operand2;
                break;
            case "2":
            case "sub":
            case "subtraction":
                result = operand1 - operand2;
                break;
            case "3":
            case "mul":
            case "multiplication":
                result = operand1 * operand2;
                break;
            case "4":
            case "div":
            case "division":
                if (operand2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                result = operand1 / operand2;
                break;
            default:
                System.out.println("Invalid operation. Please choose 1, 2, 3, or 4.");
                return;
        }

        System.out.println("Result: " + result);
    }
}
