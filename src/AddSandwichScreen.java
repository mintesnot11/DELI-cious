import java.util.Scanner;

public class AddSandwichScreen {
    private final Scanner scanner;
    private final Order order;

    public AddSandwichScreen(Scanner scanner, Order order) {
        this.scanner = scanner;
        this.order = order;
    }

    public void display() {
        System.out.println("\n-- Create Your Sandwich --");

        System.out.print("Select bread type (white, wheat, rye, wrap): ");
        String breadType = scanner.nextLine();

        System.out.print("Select sandwich size (4, 8, 12): ");
        String size = scanner.nextLine();

        System.out.print("Would you like it toasted? (yes/no): ");
        boolean isToasted = scanner.nextLine().equalsIgnoreCase("yes");

        Sandwich sandwich = new Sandwich(size, breadType, isToasted);

        // Meats
        while (true) {
            System.out.print("Add a meat (steak, ham, salami, roast beef, chicken, bacon) or 'done': ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) break;

            System.out.print("Extra? (yes/no): ");
            boolean isExtra = scanner.nextLine().equalsIgnoreCase("yes");

            sandwich.addTopping(new Meat(input, isExtra));
        }

        // Cheeses
        while (true) {
            System.out.print("Add a cheese (american, provolone, cheddar, swiss) or 'done': ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) break;

            System.out.print("Extra? (yes/no): ");
            boolean isExtra = scanner.nextLine().equalsIgnoreCase("yes");

            sandwich.addTopping(new Cheese(input, isExtra));
        }

        // Regular Toppings
        while (true) {
            System.out.print("Add a topping (lettuce, peppers, onions, etc.) or 'done': ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) break;

            sandwich.addTopping(new RegularTopping(input));
        }

        order.addSandwich(sandwich);
        System.out.println("Sandwich added!\n");
    }
}
