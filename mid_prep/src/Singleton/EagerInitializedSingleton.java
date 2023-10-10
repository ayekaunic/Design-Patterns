package Singleton;
public class EagerInitializedSingleton {
    /*
     * the instance of the singleton class is created at the time of class loading.
     * 
     * drawback: instance created even though client app might not be using it.
    */
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    private EagerInitializedSingleton() {}

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }
}
