public class PhillyCheeseSteak extends SignatureSandwich {
    public PhillyCheeseSteak() {
        super(8, "white", true, 15);
    }

    @Override
    protected void buildSignature() {
        addMeat(new Meat("steak", 5, 0));
        addCheese(new Cheese("american", 2,0));
        addTopping(new RegularTopping("peppers"));
        addTopping(new RegularTopping("mayo"));
    }
}
