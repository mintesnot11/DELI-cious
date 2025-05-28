public class Cheese extends Topping {
    private boolean extra;
    private double basePrice;
    private double extraPrice;

    public Cheese(String name, double basePrice, double extraPrice) {
        super(name);
        this.basePrice = basePrice;
        this.extraPrice = extraPrice;
    }

    public boolean isExtra() {
        return extra;
    }

    public void setExtra(boolean extra) {
        this.extra = extra;
    }

    @Override
    public double getPrice() {
        return extra ? extraPrice : basePrice;
    }

    @Override
    public String toString() {
        return super.toString() + (extra ? " (extra)" : "");
    }
}