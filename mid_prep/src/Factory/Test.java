package Factory;

public class Test {
    public static void main(String[] args) {
        Client client = new Client("TwoWheeler");
        Vehicle clientVehicle = client.getClientVehicle();
        clientVehicle.printVehicle();

        // expected output: "Two-wheeler"
    }
}
