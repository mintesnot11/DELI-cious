import java.util.Scanner;

public class AddDrinkScreen {
    private Order order;

    public AddDrinkScreen(Order order) {
        this.order = order;
    }

    public void show() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n-- 🥤 Add a Drink --");

        System.out.println("Select size:");
        System.out.println("1) Small - $2.00");
        System.out.println("2) Medium - $2.50");
        System.out.println("3) Large - $3.00");
        System.out.print("Enter choice (1-3): ");
        int sizeChoice = InputValidator.getIntInput(scanner, 1, 3);
        String size = new String[]{"small", "medium", "large"}[sizeChoice-1];
        double price = new double[]{2.00, 2.50, 3.00}[sizeChoice-1];

        System.out.println("\nSelect flavor:");
        System.out.println("1) Cola");
        System.out.println("2) Lemon-Lime");
        System.out.println("3) Strawberry");
        System.out.println("4) Orange");
        System.out.println("5) Grape");
        System.out.println("6) Root Beer");
        System.out.print("Enter choice (1-6): ");
        int flavorChoice = InputValidator.getIntInput(scanner, 1, 6);
        String flavor = new String[]{"Cola", "Lemon-Lime", "Strawberry", "Orange", "Grape", "Root Beer"}[flavorChoice-1];

        Drink drink = new Drink(size, flavor, price);
        order.addDrink(drink);
        System.out.println("\n✅ " + size + " " + flavor + " drink added!");
    }
}