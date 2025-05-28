import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Sandwich> sandwiches = new ArrayList<>();
    private List<Drink> drinks = new ArrayList<>();
    private List<Chips> chips = new ArrayList<>();

    public void addSandwich(Sandwich sandwich) {
        sandwiches.add(sandwich);
    }

    public void addDrink(Drink drink) {
        drinks.add(drink);
    }

    public void addChips(Chips chip) {
        chips.add(chip);
    }

    public double calculateTotal() {
        double total = 0;
        for (Sandwich s : sandwiches) total += s.getPrice();
        for (Drink d : drinks) total += d.getPrice();
        for (Chips c : chips) total += c.getPrice();
        return total;
    }

    public void printReceipt() {
        System.out.println("---- 📄 ORDER SUMMARY ----");
        int sandwichCount = 1;
        for (Sandwich s : sandwiches) {
            System.out.printf("\n🥪 Sandwich %d:\n", sandwichCount++);
            System.out.println(s.getDescription());
        }

        if (!drinks.isEmpty()) {
            System.out.println("\n🥤 Drinks:");
            for (Drink d : drinks) {
                System.out.printf("- %s %s - $%.2f\n", d.getSize(), d.getFlavor(), d.getPrice());
            }
        }

        if (!chips.isEmpty()) {
            System.out.println("\n🍟 Chips:");
            for (Chips c : chips) {
                System.out.printf("- %s - $%.2f\n", c.getType(), c.getPrice());
            }
        }

        System.out.printf("\n💵 Total: $%.2f\n", calculateTotal());
    }

    // Added back the getOrderSummary method for backward compatibility
    public String getOrderSummary() {
        StringBuilder sb = new StringBuilder();
        sb.append("---- ORDER SUMMARY ----\n");

        int sandwichCount = 1;
        for (Sandwich s : sandwiches) {
            sb.append("\nSandwich ").append(sandwichCount++).append(":\n");
            sb.append(s.getDescription()).append("\n");
        }

        if (!drinks.isEmpty()) {
            sb.append("\nDrinks:\n");
            for (Drink d : drinks) {
                sb.append("- ").append(d.getSize()).append(" ")
                        .append(d.getFlavor()).append(" - $")
                        .append(String.format("%.2f", d.getPrice())).append("\n");
            }
        }

        if (!chips.isEmpty()) {
            sb.append("\nChips:\n");
            for (Chips c : chips) {
                sb.append("- ").append(c.getType()).append(" - $")
                        .append(String.format("%.2f", c.getPrice())).append("\n");
            }
        }

        sb.append("\nTotal: $").append(String.format("%.2f", calculateTotal())).append("\n");
        return sb.toString();
    }
}