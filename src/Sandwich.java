import java.util.ArrayList;
import java.util.List;

public class Sandwich {
    private int size;
    private String breadType;
    private boolean toasted;
    private double basePrice;
    private List<Meat> meats = new ArrayList<>();
    private List<Cheese> cheeses = new ArrayList<>();
    private List<RegularTopping> toppings = new ArrayList<>();

    public Sandwich(int size, String breadType, boolean toasted, double basePrice) {
        this.size = size;
        this.breadType = breadType;
        this.toasted = toasted;
        this.basePrice = basePrice;
    }

    public void addMeat(Meat meat) {
        meats.add(meat);
    }

    public void addCheese(Cheese cheese) {
        cheeses.add(cheese);
    }

    public void addTopping(RegularTopping topping) {
        toppings.add(topping);
    }

    public double getPrice() {
        double price = basePrice;
        for (Meat m : meats) price += m.getPrice();
        for (Cheese c : cheeses) price += c.getPrice();
        return price;
    }

    public String getDescription() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%d\" %s sandwich\n", size, breadType));
        sb.append(String.format("Toasted: %s\n", toasted ? "Yes 🔥" : "No"));

        if (!meats.isEmpty()) {
            sb.append("Meats:\n");
            for (Meat m : meats) {
                sb.append(String.format("- %s%s - $%.2f\n",
                        m.getName(),
                        m.isExtra() ? " (extra)" : "",
                        m.getPrice()));
            }
        }

        if (!cheeses.isEmpty()) {
            sb.append("Cheeses:\n");
            for (Cheese c : cheeses) {
                sb.append(String.format("- %s%s - $%.2f\n",
                        c.getName(),
                        c.isExtra() ? " (extra)" : "",
                        c.getPrice()));
            }
        }

        if (!toppings.isEmpty()) {
            sb.append("Toppings:\n");
            for (RegularTopping t : toppings) {
                sb.append(String.format("- %s\n", t.getName()));
            }
        }

        sb.append(String.format("Price: $%.2f", getPrice()));
        return sb.toString();
    }
}