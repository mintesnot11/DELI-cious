public class Meat extends Topping {

    public Meat(String name, boolean isExtra) {
        super(name, isExtra);
    }

    @Override
    public double getPrice(String size) {
        double basePrice = 0;
        switch (size) {
            case "4":
                basePrice = isExtra ? 0.50 : 1.00;
                break;
            case "8":
                basePrice = isExtra ? 1.00 : 2.00;
                break;
            case "12":
                basePrice = isExtra ? 1.50 : 3.00;
                break;
        }
        return basePrice;
    }
}