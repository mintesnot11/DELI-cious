import java.util.Scanner;

public class OrderScreen {
    private Order order = new Order();

    public void show() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- 🛒 ORDER MENU ---");
            System.out.println("1) 🥪 Add Sandwich");
            System.out.println("2) 🥤 Add Drink");
            System.out.println("3) 🍟 Add Chips");
            System.out.println("4) 🆕 Use Signature Sandwich");
            System.out.println("5) 💰 Checkout");
            System.out.println("0) ❌ Cancel Order");
            System.out.print("Choose an option: ");

            int choice = InputValidator.getIntInput(scanner, 0, 5);

            switch (choice) {
                case 1:
                    AddSandwichScreen sandwichScreen = new AddSandwichScreen(order);
                    sandwichScreen.show();
                    break;
                case 2:
                    AddDrinkScreen drinkScreen = new AddDrinkScreen(order);
                    drinkScreen.show();
                    break;
                case 3:
                    AddChipsScreen chipsScreen = new AddChipsScreen(order);
                    chipsScreen.show();
                    break;
                case 4:
                    SignatureSandwichScreen signatureSandwichScreen = new SignatureSandwichScreen(order);
                    signatureSandwichScreen.show();
                    break;
                case 5:
                    CheckoutScreen checkoutScreen = new CheckoutScreen(scanner, order);
                    checkoutScreen.display();
                    return;
                case 0:
                    System.out.println("\nOrder cancelled. Returning to main menu. ↩️");
                    return;
            }
        }
    }
}