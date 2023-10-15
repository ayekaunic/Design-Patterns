public abstract class Fries implements Item {
    
    @Override
    public Packing packing() {
        return new Box();
    }

    @Override
    public abstract float price();
}
