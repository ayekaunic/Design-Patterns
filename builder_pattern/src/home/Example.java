package home;
public class Example {
    public static void main(String[] args) {
        HomeBuilder contractor = new HomeBuilder();
        contractor.setRooms(4);
        contractor.setFloors(2);
        Home house = contractor.buildHome();
        System.out.println(house.describe());
        contractor.setArea(360);
        System.out.println(house.describe());
        house = contractor.buildHome();
        System.out.println(house.describe());
    }
}
