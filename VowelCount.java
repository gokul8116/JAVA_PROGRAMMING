import java.util.Scanner;

public class VowelCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toLowerCase();

        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        // Output the count of vowels
        System.out.println("Number of vowels in the string: " + count);
    }
}
