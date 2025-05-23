import java.util.ArrayList;
import java.util.List;

public class Sandwich {
    private String size;
    private String breadType;
    private List<Topping> toppings;
    private boolean isToasted;

    public Sandwich(String size, String breadType, boolean isToasted) {
        this.size = size;
        this.breadType = breadType;
        this.isToasted = isToasted;
        this.toppings = new ArrayList<>();
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    public double calculatePrice() {
        double price = 0.0;

        // Base bread price
        switch (size) {
            case "4":
                price += 5.50;
                break;
            case "8":
                price += 7.00;
                break;
            case "12":
                price += 8.50;
                break;
        }

        // Add price of all toppings
        for (Topping topping : toppings) {
            price += topping.getPrice(size);
        }

        return price;
    }

    public String getDescription() {
        StringBuilder sb = new StringBuilder();
        sb.append(size).append("\" ").append(breadType).append(" sandwich\n");
        sb.append("Toasted: ").append(isToasted ? "Yes" : "No").append("\n");
        sb.append("Toppings:\n");
        for (Topping topping : toppings) {
            sb.append("- ").append(topping.getName());
            if (topping.isExtra()) {
                sb.append(" (extra)");
            }
            sb.append("\n");
        }
        sb.append("Price: $").append(String.format("%.2f", calculatePrice()));
        return sb.toString();
    }

    // Getters
    public String getSize() { return size; }
    public String getBreadType() { return breadType; }
    public List<Topping> getToppings() { return toppings; }
    public boolean isToasted() { return isToasted; }
}