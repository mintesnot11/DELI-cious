public class Chips {
    private String type;

    public Chips(String type) {
        this.type = type;
    }

    public double getPrice() {
        return 1.50;
    }

    public String getDescription() {
        return type + " chips - $1.50";
    }

    // Getter
    public String getType() { return type; }
}
