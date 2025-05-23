public class Cheese extends Topping {

    public Cheese(String name, boolean isExtra) {
        super(name, isExtra);
    }

    @Override
    public double getPrice(String size) {
        double basePrice = 0;
        switch (size) {
            case "4":
                basePrice = isExtra ? 0.30 : 0.75;
                break;
            case "8":
                basePrice = isExtra ? 0.60 : 1.50;
                break;
            case "12":
                basePrice = isExtra ? 0.90 : 2.25;
                break;
        }
        return basePrice;
    }
}
