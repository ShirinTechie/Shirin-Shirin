import java.util.Scanner;

public class Problem1 {
    // Define operations using methods
    public double add(double a, double b) { return a + b; }
    public double subtract(double a, double b) { return a - b; }
    public double multiply(double a, double b) { return a * b; }
    public double divide(double a, double b) {
        if (b == 0) throw new ArithmeticException("Cannot divide by zero");
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create scanner for input
        Problem1 calc = new Problem1(); // Create object of Calculator class

        // Taking input from user
        System.out.print("Enter first number (a): ");
        double a = scanner.nextDouble();

        System.out.print("Enter second number (b): ");
        double b = scanner.nextDouble();

        System.out.print("Enter operation (add, sub, mul, div): ");
        String operation = scanner.next();

        double result = 0;

        // Switch case to perform correct operation
        switch (operation) {
            case "add": result = calc.add(a, b); break;
            case "sub": result = calc.subtract(a, b); break;
            case "mul": result = calc.multiply(a, b); break;
            case "div": result = calc.divide(a, b); break;
            default: System.out.println("Invalid operation"); return;
        }

        System.out.println("Result: " + result); // Final output
    }
}
