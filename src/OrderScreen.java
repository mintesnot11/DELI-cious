// src/OrderScreen.java
import java.util.Scanner;

public class OrderScreen {
    private final Scanner scanner;
    private final Order order;

    public OrderScreen(Scanner scanner, Order order) {
        this.scanner = scanner;
        this.order = order;
    }

    public void display() {
        boolean ordering = true;

        while (ordering) {
            System.out.println("\n--- ORDER MENU ---");
            System.out.println("1) Add Sandwich");
            System.out.println("2) Add Drink");
            System.out.println("3) Add Chips");
            System.out.println("4) Checkout");
            System.out.println("0) Cancel Order");
            System.out.print("Choose an option: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    AddSandwichScreen sandwichScreen = new AddSandwichScreen(scanner, order);
                    sandwichScreen.display();
                    break;
                case "2":
                    AddDrinkScreen drinkScreen = new AddDrinkScreen(scanner, order);
                    drinkScreen.display();
                    break;
                case "3":
                    AddChipsScreen chipsScreen = new AddChipsScreen(scanner, order);
                    chipsScreen.display();
                    break;
                case "4":
                    CheckoutScreen checkoutScreen = new CheckoutScreen(scanner, order);
                    checkoutScreen.display();
                    ordering = false;
                    break;
                case "0":
                    System.out.println("Order cancelled. Returning to Home Screen.");
                    ordering = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
