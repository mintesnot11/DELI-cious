public class RegularTopping extends Topping {

    public RegularTopping(String name) {
        super(name, false);
    }

    @Override
    public double getPrice(String size) {
        return 0.0;
    }
}