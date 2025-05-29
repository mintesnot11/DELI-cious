public abstract class SignatureSandwich extends Sandwich {
    public SignatureSandwich(int size, String breadType, boolean isToasted, double basePrice) {
        super(size, breadType, isToasted, basePrice);
        buildSignature();
    }

    protected abstract void buildSignature();
}
