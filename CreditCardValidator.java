import java.util.Scanner;
import java.util.regex.*;

public class CreditCardValidator {

    public static boolean isValidCreditCard(String card) {
        //regular expression
        String regex = "^[456]\\d{3}(-?\\d{4}){3}$";
        
        // Compile the pattern
        Pattern pattern = Pattern.compile(regex);
        
        // Check if the card matches the basic pattern
        if (!pattern.matcher(card).matches()) {
            return false;
        }
        
        // Remove hyphens
        String cardNumber = card.replaceAll("-", "");
        
        // Check if there are 4 or more consecutive repeated digits
        if (Pattern.compile("(\\d)\\1{3}").matcher(cardNumber).find()) {
            return false;
        }
        
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of cards
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        // Process each card
        for (int i = 0; i < n; i++) {
            String card = scanner.nextLine().trim();
            if (isValidCreditCard(card)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }

        scanner.close();
    }
}


