package Singleton;

public class NtonSingleton {
    private static NtonSingleton[] instances;
    private static int numberOfInstances;
    private static int counter = 0;
    private int identifier;

    private NtonSingleton() {}

    public static void setNumOfInstances(int num) {
        numberOfInstances = num;
        instances = new NtonSingleton[num];
    }

    public static NtonSingleton getInstance() {
        if (counter < numberOfInstances) {
            instances[counter] = new NtonSingleton();
            instances[counter].identifier = counter+1;
            counter++;
        }
        else {
            counter++;
        }
        return instances[(counter-1) % numberOfInstances];
    }

    public int getIdentifier() {
        return identifier;
    }

}
