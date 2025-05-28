import java.util.Scanner;

public class AddSandwichScreen {
    private Order order;
    private Scanner scanner = new Scanner(System.in);

    public AddSandwichScreen(Order order) {
        this.order = order;
    }

    public void show() {
        System.out.println("\n-- Create Your Sandwich --");

        // Bread selection
        System.out.println("\n🍞 Select bread type:");
        System.out.println("1) White");
        System.out.println("2) Wheat");
        System.out.println("3) Rye");
        System.out.println("4) Wrap");
        System.out.print("Enter choice (1-4): ");
        int breadChoice = InputValidator.getIntInput(scanner, 1, 4);
        String bread = new String[]{"white", "wheat", "rye", "wrap"}[breadChoice-1];

        // Size selection
        System.out.println("\n📏 Select sandwich size:");
        System.out.println("1) 4\" - $5.50");
        System.out.println("2) 8\" - $7.00");
        System.out.println("3) 12\" - $8.50");
        System.out.print("Enter choice (1-3): ");
        int sizeChoice = InputValidator.getIntInput(scanner, 1, 3);
        int size = new int[]{4, 8, 12}[sizeChoice-1];
        double basePrice = new double[]{5.50, 7.00, 8.50}[sizeChoice-1];

        // Toasted
        System.out.print("\n🔥 Would you like it toasted? ");
        boolean toasted = InputValidator.getYesNoInput(scanner);

        Sandwich sandwich = new Sandwich(size, bread, toasted, basePrice);
        addMeats(sandwich);
        addCheeses(sandwich);
        addToppings(sandwich);

        order.addSandwich(sandwich);
        System.out.println("\n✅ Sandwich added to order!");
    }

    private void addMeats(Sandwich sandwich) {
        Meat[] meatOptions = {
                new Meat("Steak", 1.00, 0.50),
                new Meat("Ham", 0.75, 0.30),
                new Meat("Salami", 0.80, 0.35),
                new Meat("Roast Beef", 0.90, 0.40),
                new Meat("Chicken", 0.85, 0.35),
                new Meat("Bacon", 0.70, 0.30)
        };

        while (true) {
            System.out.println("\n🥩 Add a meat (or 0 to finish):");
            for (int i = 0; i < meatOptions.length; i++) {
                System.out.printf("%d) %s - $%.2f\n", i+1, meatOptions[i].getName(), meatOptions[i].getPrice());
            }
            System.out.println("0) Done");
            System.out.print("Enter choice: ");

            int choice = InputValidator.getIntInput(scanner, 0, meatOptions.length);
            if (choice == 0) break;

            Meat selected = meatOptions[choice-1];
            System.out.print("Extra meat? ");
            selected.setExtra(InputValidator.getYesNoInput(scanner));
            sandwich.addMeat(selected);
            System.out.printf("✅ Added %s%s\n", selected.getName(), selected.isExtra() ? " (extra)" : "");
        }
    }

    private void addCheeses(Sandwich sandwich) {
        Cheese[] cheeseOptions = {
                new Cheese("American", 0.50, 0.25),
                new Cheese("Provolone", 0.60, 0.30),
                new Cheese("Cheddar", 0.55, 0.25),
                new Cheese("Swiss", 0.65, 0.30)
        };

        while (true) {
            System.out.println("\n🧀 Add a cheese (or 0 to finish):");
            for (int i = 0; i < cheeseOptions.length; i++) {
                System.out.printf("%d) %s - $%.2f\n", i+1, cheeseOptions[i].getName(), cheeseOptions[i].getPrice());
            }
            System.out.println("0) Done");
            System.out.print("Enter choice: ");

            int choice = InputValidator.getIntInput(scanner, 0, cheeseOptions.length);
            if (choice == 0) break;

            Cheese selected = cheeseOptions[choice-1];
            System.out.print("Extra cheese? ");
            selected.setExtra(InputValidator.getYesNoInput(scanner));
            sandwich.addCheese(selected);
            System.out.printf("✅ Added %s%s\n", selected.getName(), selected.isExtra() ? " (extra)" : "");
        }
    }

    private void addToppings(Sandwich sandwich) {
        String[] toppingOptions = {
                "Lettuce", "Tomatoes", "Onions", "Pickles",
                "Peppers", "Cucumbers", "Olives", "Mayo",
                "Mustard", "Ketchup", "Ranch", "Oil", "Vinegar"
        };

        while (true) {
            System.out.println("\n🥬 Add a topping (or 0 to finish):");
            for (int i = 0; i < toppingOptions.length; i++) {
                System.out.printf("%d) %s\n", i+1, toppingOptions[i]);
            }
            System.out.println("0) Done");
            System.out.print("Enter choice: ");

            int choice = InputValidator.getIntInput(scanner, 0, toppingOptions.length);
            if (choice == 0) break;

            RegularTopping topping = new RegularTopping(toppingOptions[choice-1]);
            sandwich.addTopping(topping);
            System.out.printf("✅ Added %s\n", topping.getName());
        }
    }
}
