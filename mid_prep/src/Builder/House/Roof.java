package Builder.House;

public class Roof implements Component {

    @Override
    public String name() {
        return "Roof";
    }

    @Override
    public int price() {
        return 500;
    }
    
}
