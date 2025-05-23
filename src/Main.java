import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("=== DELI-cious Sandwich Shop ===");
            System.out.println("1) New Order");
            System.out.println("0) Exit");
            System.out.print("Choose an option: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    Order order = new Order();
                    handleOrderMenu(order, scanner);
                    break;
                case "0":
                    System.out.println("Thank you for visiting DELI-cious. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1 or 0.");
            }
        }

        scanner.close();
    }

    // Step 2: Show the order menu
    public static void handleOrderMenu(Order order, Scanner scanner) {
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
                    // TODO: Add Sandwich
                    break;
                case "2":
                    // TODO: Add Drink
                    break;
                case "3":
                    // TODO: Add Chips
                    break;
                case "4":
                    System.out.println("\n" + order.getOrderSummary());
                    // TODO: Add confirmation and receipt writing
                    ordering = false;
                    break;
                case "0":
                    System.out.println("Order cancelled. Returning to Home.");
                    ordering = false;
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
