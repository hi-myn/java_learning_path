import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out
                .println("Choose the mathematical operation: \n(+)Sum\n(-)Subtraction\n(/)Division\n(*)Multiplication");
        String operation = scanner.next();

        double result = 0;

        switch (operation) {
            case "+":
                result = sum(num1, num2);
                break;
            case "-":
                result = subtraction(num1, num2);
                break;
            case "*":
                result = multiplication(num1, num2);
                break;
            case "/":
                if (num2 != 0) {
                    result = division(num1, num2);
                } else {
                    System.out.println("Invalid operation");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operation");
                return;
        }

        System.out.printf("%.1f %s %.1f = %.1f", num1, operation, num2, result);

        scanner.close();
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static double subtraction(double a, double b) {
        return a - b;
    }

    public static double division(double a, double b) {
        return a / b;
    }

    public static double multiplication(double a, double b) {
        return a * b;
    }
}
