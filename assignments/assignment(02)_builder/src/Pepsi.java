public class Pepsi extends ColdDrink {

    Pepsi(String choice) {
        super.packing = choice;
    }
    
    @Override
    public float price() {
        if (super.packing.equals("Can")) {
            return 40.0f;
        } else if (super.packing.equals("Bottle")) {
            return 35.0f;
        } else {
            return 0.0f;
        }
    }

    @Override
    public String name() {
        return "Pepsi";
    }

}
