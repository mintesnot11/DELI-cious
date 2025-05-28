import java.util.Scanner;

public class InputValidator {

    public static int getIntInput(Scanner scanner, int min, int max) {
        while (true) {
            String input = scanner.nextLine();
            try {
                int value = Integer.parseInt(input);
                if (value >= min && value <= max) {
                    return value;
                }
            } catch (NumberFormatException e) {

            }
            System.out.print("❌ Invalid input. Enter a number between " + min + " and " + max + ": ");
        }
    }

    public static boolean getYesNoInput(Scanner scanner) {
        while (true) {
            System.out.print("(yes/no): ");
            String input = scanner.nextLine().trim().toLowerCase();
            if (input.equals("yes") || input.equals("y")) return true;
            if (input.equals("no") || input.equals("n")) return false;
            System.out.print("❌ Please enter 'yes' or 'no': ");
        }
    }
}
