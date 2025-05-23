import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Sandwich> sandwiches;
    private List<Drink> drinks;
    private List<Chips> chips;

    public Order() {
        this.sandwiches = new ArrayList<>();
        this.drinks = new ArrayList<>();
        this.chips = new ArrayList<>();
    }

    // Add items
    public void addSandwich(Sandwich sandwich) {
        sandwiches.add(sandwich);
    }

    public void addDrink(Drink drink) {
        drinks.add(drink);
    }

    public void addChips(Chips chip) {
        chips.add(chip);
    }

    // Calculate total price
    public double calculateTotal() {
        double total = 0.0;
        for (Sandwich s : sandwiches) {
            total += s.calculatePrice();
        }
        for (Drink d : drinks) {
            total += d.getPrice();
        }
        for (Chips c : chips) {
            total += c.getPrice();
        }
        return total;
    }

    // Summary for display
    public String getOrderSummary() {
        StringBuilder sb = new StringBuilder();
        sb.append("---- ORDER SUMMARY ----\n");

        if (sandwiches.isEmpty() && drinks.isEmpty() && chips.isEmpty()) {
            sb.append("No items in this order.\n");
        }

        int count = 1;

        for (Sandwich s : sandwiches) {
            sb.append("\nSandwich ").append(count++).append(":\n");
            sb.append(s.getDescription()).append("\n");
        }

        for (Drink d : drinks) {
            sb.append("\n").append(d.getDescription()).append("\n");
        }

        for (Chips c : chips) {
            sb.append("\n").append(c.getDescription()).append("\n");
        }

        sb.append("\nTotal: $").append(String.format("%.2f", calculateTotal()));
        return sb.toString();
    }

    // Getters (optional, if needed later)
    public List<Sandwich> getSandwiches() { return sandwiches; }
    public List<Drink> getDrinks() { return drinks; }
    public List<Chips> getChips() { return chips; }
}
