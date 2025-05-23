import java.util.Scanner;

public class AddChipsScreen {
    private final Scanner scanner;
    private final Order order;

    public AddChipsScreen(Scanner scanner, Order order) {
        this.scanner = scanner;
        this.order = order;
    }

    public void display() {
        System.out.println("\n-- Add Chips --");

        System.out.print("Enter chip type (e.g., BBQ, Sour Cream, Classic): ");
        String type = scanner.nextLine();

        Chips chips = new Chips(type);
        order.addChips(chips);

        System.out.println("Chips added!\n");
    }
}
