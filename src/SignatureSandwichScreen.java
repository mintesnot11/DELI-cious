import java.util.Scanner;

public class SignatureSandwichScreen {
    private Order order;
    private Scanner scanner = new Scanner(System.in);

    public SignatureSandwichScreen(Order order) {
        this.order = order;
    }

    public void show() {

        // Bread selection
        System.out.println("\n🍞 Choose your signature sandwich:");
        System.out.println("1) BLT Sandwich");
        System.out.println("2) Philly Cheese Steak");
        System.out.print("Enter choice (1-2): ");
        int signatureChoice = InputValidator.getIntInput(scanner, 1, 2);

        Sandwich sandwich = null;
        switch (signatureChoice) {
            case 1:
                sandwich = new BLTSandwich();
                break;
            case 2:
                sandwich = new PhillyCheeseSteak();
                break;
        }

        order.addSandwich(sandwich);
        System.out.println("\n✅ Sandwich added to order!");
    }

}
