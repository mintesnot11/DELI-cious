public class Meat {
    private String name;
    private boolean extra;
    private double price;
    private double extraPrice;

    public Meat(String name, double price, double extraPrice) {
        this.name = name;
        this.price = price;
        this.extraPrice = extraPrice;
    }

    public String getName() { return name; }
    public boolean isExtra() { return extra; }
    public double getPrice() { return extra ? extraPrice : price; }
    public void setExtra(boolean extra) { this.extra = extra; }
}