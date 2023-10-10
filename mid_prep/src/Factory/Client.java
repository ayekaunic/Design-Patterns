package Factory;

public class Client {
    private final Vehicle vehicle;

    public Client (String vehicleType) {
        vehicle = VehicleFactory.getVehicle(vehicleType);
    }

    public Vehicle getClientVehicle() {
        return vehicle;
    }
}
