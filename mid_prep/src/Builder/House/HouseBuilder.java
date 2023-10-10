package Builder.House;

public class HouseBuilder {
    public House buildHouseWithWindows() {
        House house = new House();
        house.addComponent(new Windows());
        house.addComponent(new Door());
        house.addComponent(new Walls());
        house.addComponent(new Roof());
        return house;
    }

    public House buildHouseWithoutWindows() {
        House house = new House();
        house.addComponent(new Door());
        house.addComponent(new Walls());
        house.addComponent(new Roof());
        return house;
    }
}
