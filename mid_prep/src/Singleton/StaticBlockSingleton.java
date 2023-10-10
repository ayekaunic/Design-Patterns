package Singleton;
public class StaticBlockSingleton {
    private static StaticBlockSingleton instance;

    private StaticBlockSingleton() {}

    /*
     * similar to eager initialization except,
     * 
     * instance of the class is created in a static block that allows
     * the option for exception handling
     * 
     * both, eager & static initialization, create the instance before
     * it is even being used - not a good practice
    */
    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Error occured.");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}
