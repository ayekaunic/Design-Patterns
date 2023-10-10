package Builder.House;

public class Test {
    public static void main(String[] args) {
        HouseBuilder builder = new HouseBuilder();

        House house1 = builder.buildHouseWithWindows();
        System.out.println("House with windows:");
        house1.showComponents();
        System.out.println("Cost: " + house1.getCost());
        System.out.println();
        
        House house2 = builder.buildHouseWithoutWindows();
        System.out.println("House without windows:");
        house2.showComponents();
        System.out.println("Cost: " + house2.getCost());
    }
}
