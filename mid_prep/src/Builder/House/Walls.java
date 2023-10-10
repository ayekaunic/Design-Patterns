package Builder.House;

public class Walls implements Component {
    @Override
    public String name() {
        return "Walls";
    }

    @Override
    public int price() {
        return 1000;
    }
}
