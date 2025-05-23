import java.util.Scanner;

public class AddDrinkScreen {
    private final Scanner scanner;
    private final Order order;

    public AddDrinkScreen(Scanner scanner, Order order) {
        this.scanner = scanner;
        this.order = order;
    }

    public void display() {
        System.out.println("\n-- Add a Drink --");

        System.out.print("Choose size (small, medium, large): ");
        String size = scanner.nextLine();

        System.out.print("Choose flavor: ");
        String flavor = scanner.nextLine();

        Drink drink = new Drink(size, flavor);
        order.addDrink(drink);

        System.out.println("Drink added!\n");
    }
}
