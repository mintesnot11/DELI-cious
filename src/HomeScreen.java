import java.util.Scanner;

public class HomeScreen {
    private final Scanner scanner = new Scanner(System.in);

    public void start() {
        boolean running = true;

        while (running) {
            System.out.println("=== DELI-cious Sandwich Shop ===");
            System.out.println("1) New Order");
            System.out.println("0) Exit");
            System.out.print("Choose an option: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    Order newOrder = new Order();
                    OrderScreen orderScreen = new OrderScreen(scanner, newOrder);
                    orderScreen.display();
                    break;
                case "0":
                    System.out.println("Thank you for visiting DELI-cious. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1 or 0.");
            }
        }
    }
}
