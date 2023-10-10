package Builder.House;

import java.util.ArrayList;
import java.util.List;

public class House {
    private List<Component> components = new ArrayList<Component>();

    public void addComponent(Component component){
        components.add(component);
    }

    public int getCost() {
        int cost = 0;
        for (Component component : components) {
            cost += component.price();
        }
        return cost;
    }

    public void showComponents() {
        for (Component component : components) {
            System.out.print("Component : " + component.name());
            System.out.println(", Price : " + component.price());
        }
    }
}
