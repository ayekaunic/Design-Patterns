package pizza;

public class PizzaBuilder {
    private String flavor;
    private int slices;


    public PizzaBuilder chooseFlavor(String flavor) {
        this.flavor = flavor;
        return this;
    }

    public PizzaBuilder chooseSlices(int slices) {
        this.slices = slices;
        return this;
    }

    public Pizza bakePizza() {
        return new Pizza(flavor, slices);
    }
}
