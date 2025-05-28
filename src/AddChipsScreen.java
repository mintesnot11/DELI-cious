import java.util.Scanner;

public class AddChipsScreen {
    private Order order;

    public AddChipsScreen(Order order) {
        this.order = order;
    }

    public void show() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n-- 🍟 Add Chips --");

        System.out.println("Select chip type:");
        System.out.println("1) Classic - $1.50");
        System.out.println("2) BBQ - $1.75");
        System.out.println("3) Sour Cream - $1.75");
        System.out.println("4) Salt & Vinegar - $1.75");
        System.out.println("5) Jalapeño - $1.75");
        System.out.println("6) Sea Salt - $1.50");
        System.out.print("Enter choice (1-6): ");
        int typeChoice = InputValidator.getIntInput(scanner, 1, 6);
        String type = new String[]{"Classic", "BBQ", "Sour Cream", "Salt & Vinegar", "Jalapeño", "Sea Salt"}[typeChoice-1];
        double price = typeChoice == 1 || typeChoice == 6 ? 1.50 : 1.75;

        Chips chips = new Chips(type, price);
        order.addChips(chips);
        System.out.println("\n✅ " + type + " chips added!");
    }
}