package Factory;

public class VehicleFactory {
    public static Vehicle getVehicle(String type) {
        if (type.equals("TwoWheeler")) {
            return new TwoWheeler();
        } else if (type.equals("ThreeWheeler")) {
            return new ThreeWheeler();
        } else {
            return null;
        }
    }
}
