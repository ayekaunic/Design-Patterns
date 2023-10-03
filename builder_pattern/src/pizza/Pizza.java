package pizza;

public class Pizza {
    private String flavor;
    private int slices;

    public Pizza(String flavor, int slices) {
        this.flavor = flavor;
        this.slices = slices;
    }

    public String describe() {
        return "Flavor: "+this.flavor+"\nSlices:"+this.slices;
    }
}
