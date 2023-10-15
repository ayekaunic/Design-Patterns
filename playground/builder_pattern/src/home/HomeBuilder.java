package home;
public class HomeBuilder {
    private int rooms;
    private int floors;
    private int area;

    public HomeBuilder setRooms(int rooms) {
        this.rooms = rooms;
        return this;
    }

    public HomeBuilder setFloors(int floors) {
        this.floors = floors;
        return this;
    }

    public HomeBuilder setArea(int area) {
        this.area = area;
        return this;
    }
    
    public Home buildHome() {
        return new Home(rooms, floors, area);
    }
}
