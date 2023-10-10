package Builder.House;

public class Door implements Component {
    
    @Override
    public String name() {
        return "Door";
    }

    @Override
    public int price() {
        return 200;
    }
}
