package home;
public class Home {
    private int rooms;
    private int floors;
    private int area;

    public Home(int rooms, int floors, int area) {
        super();
        this.rooms = rooms;
        this.floors = floors;
        this.area = area;
    }

    public String describe() {
        return "Rooms: " + this.rooms + "\nFloors: " + this.floors + "\nArea: " + this.area;
    }
}
