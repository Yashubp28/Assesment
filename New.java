import java.util.*;

public class New {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of words
        System.out.println("Enter the number of words:");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        List<String> words = new ArrayList<>();
        System.out.println("Enter the words:");
        
        // Read the words from the user
        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            words.add(word);
        }

        // Create a map to count occurrences and maintain distinct order
        Map<String, Integer> wordCount = new LinkedHashMap<>();
        
        // Count occurrences and maintain order
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Print the count of distinct words
        System.out.println(wordCount.size());

        // Print the occurrences of each distinct word in the order of appearance
        for (Integer count : wordCount.values()) {
            System.out.print(count + " ");
        }

        scanner.close();
    }
}


