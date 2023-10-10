package Builder.House;

public class Windows implements Component {

    @Override
    public String name() {
        return "Windows";
    }

    @Override
    public int price() {
        return 300;
    }
    
}
