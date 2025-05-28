import java.util.Scanner;

public class HomeScreen {
    public void show() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== 🥪 DELI-cious Sandwich Shop 🥤 ===");
            System.out.println("1) 🆕 New Order");
            System.out.println("2) 🆕 Use Template Order");
            System.out.println("0) ❌ Exit");
            System.out.print("Choose an option: ");

            int choice = InputValidator.getIntInput(scanner, 0, 1);

            switch (choice) {
                case 1:
                    OrderScreen orderScreen = new OrderScreen();
                    orderScreen.show();
                    break;
                case 0:
                    System.out.println("\nThank you for visiting DELI-cious. Goodbye! 👋");
                    return;
            }
        }
    }
}