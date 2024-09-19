import java.util.Scanner;

public class CheckNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Create Scanner object for input

        System.out.print("Enter a number: ");    // Prompt the user to enter a number
        int number = input.nextInt();            // Read the number entered by the user

        // Check if the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        input.close();  // Close the Scanner object
    }
}
