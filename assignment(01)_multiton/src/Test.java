// This class tests the NtonSingleton class.
public class Test {
    public static void main(String[] args) {

        // Setting the maximum number of NtonSingleton instances to 3.
        NtonSingleton.setNumOfInstances(3);

        // Creating 5 NtonSingleton instances.
        NtonSingleton s1 = NtonSingleton.getInstance();
        NtonSingleton s2 = NtonSingleton.getInstance();
        NtonSingleton s3 = NtonSingleton.getInstance();
        NtonSingleton s4 = NtonSingleton.getInstance();
        NtonSingleton s5 = NtonSingleton.getInstance();
        
        // Print the identifiers of the NtonSingleton instances.
        System.out.println("s1 = "+ s1.getIdentifier());
        System.out.println("s2 = "+ s2.getIdentifier());
        System.out.println("s3 = "+ s3.getIdentifier());
        System.out.println("s4 = "+ s4.getIdentifier());
        System.out.println("s5 = "+ s5.getIdentifier());

        // Expected output upon running:
        // s1 = 1
        // s2 = 2
        // s3 = 3
        // s4 = 1
        // s5 = 2
    }
}
