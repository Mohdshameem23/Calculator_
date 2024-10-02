import java.util.Scanner;

public class Calculator{

    // add two numbers
    public static double add(double a, double b) {
        return a + b;
    }

    // subtract two numbers
    public static double subtract(double a, double b) {
        return a - b;
    }

    // multiply two numbers
    public static double multiply(double a, double b) {
        return a * b;
    }

    // divide two numbers
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Displaying operation options to the user
        System.out.println("Select an operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");

        // Taking the user input for operation
        int choice = scanner.nextInt();

        // Taking input for the two numbers
        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();
        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();

        // Calling the appropriate function based on user's choice
        double result;
        switch (choice) {
            case 1:
                result = add(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 2:
                result = subtract(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 3:
                result = multiply(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 4:
                result = divide(num1, num2);
                if (num2 != 0) {
                    System.out.println("Result: " + result);
                }
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
