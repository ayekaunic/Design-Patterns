public abstract class ColdDrink implements Item {
    public String packing;

    @Override
    public Packing packing() {
        if (packing.equals("Bottle")) {
            return new Bottle();
        } else if (packing.equals("Can")) {
            return new Can();
        } else {
            return null;
        }
    }

    @Override
    public abstract float price();

}
