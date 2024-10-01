import java.util.Scanner;

public class PasswordStrengthChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your password: ");
        String password = scanner.nextLine();

        int strengthScore = checkPasswordStrength(password);

        if (strengthScore <= 2) {
            System.out.println("Password strength: Weak");
            System.out.println("Suggestions: Use a longer password with uppercase, lowercase, digits, and special characters.");
        } else if (strengthScore == 3) {
            System.out.println("Password strength: Moderate");
            System.out.println("Suggestions: Consider adding more complex characters.");
        } else {
            System.out.println("Password strength: Strong");
        }
        scanner.close();
    }

    public static int checkPasswordStrength(String password) {
        int strength = 0;

        if (password.length() >= 8) strength++; // Length check
        if (password.matches(".*[A-Z].*")) strength++; // Uppercase check
        if (password.matches(".*[a-z].*")) strength++; // Lowercase check
        if (password.matches(".*\\d.*")) strength++; // Number check
        if (password.matches(".*[!@#$%^&*].*")) strength++; // Special character check

        return strength;
    }
}
