import java.util.HashMap;
import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine().toLowerCase();

        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        for (char ch : sentence.toCharArray()) {
            if (Character.isAlphabetic(ch)) {
                frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
            }
        }

        System.out.println("Character Frequencies:");
        for (char ch : frequencyMap.keySet()) {
            System.out.println(ch + ": " + frequencyMap.get(ch));
        }

        scanner.close();
    }
}
