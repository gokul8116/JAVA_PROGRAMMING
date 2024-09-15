// Basic Aritmetic program
public class BasicArithmetic {

    // Main method - Entry point of the program
    public static void main(String[] args) {

        // Declare two integer variables
        int num1 = 10;  // Assign 10 to num1
        int num2 = 5;   // Assign 5 to num2

        // Addition of num1 and num2
        int sum = num1 + num2;  // 10 + 5 = 15
        System.out.println("Sum: " + sum);  // Output the sum

        // Subtraction of num2 from num1
        int difference = num1 - num2;  // 10 - 5 = 5
        System.out.println("Difference: " + difference);  // Output the difference

        // Multiplication of num1 and num2
        int product = num1 * num2;  // 10 * 5 = 50
        System.out.println("Product: " + product);  // Output the product

        // Division of num1 by num2
        int quotient = num1 / num2;  // 10 / 5 = 2
        System.out.println("Quotient: " + quotient);  // Output the quotient

        // Modulus operation (remainder of num1 divided by num2)
        int remainder = num1 % num2;  // 10 % 5 = 0
        System.out.println("Remainder: " + remainder);  // Output the remainder
    }
}
