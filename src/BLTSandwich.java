public class BLTSandwich extends SignatureSandwich {
    public BLTSandwich() {
        super(8, "white", true, 40); // Size, bread, toasted
    }

    @Override
    protected void buildSignature() {
        addMeat(new Meat("bacon", 2,0));
        addCheese(new Cheese("cheddar", 1,0));
        addTopping(new RegularTopping("lettuce"));
        addTopping(new RegularTopping("tomato"));
        addTopping(new RegularTopping("ranch"));
    }
}
