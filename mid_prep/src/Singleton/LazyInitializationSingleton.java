package Singleton;
public class LazyInitializationSingleton {
    private static LazyInitializationSingleton instance;

    private LazyInitializationSingleton() {}

    /*
     * creates the instance in the global access method
     * 
     * works fine in a single-threaded environment
     * 
     * but can cause issues if multiple threads are inside the if condition at the same time
     * it will destroy the singleton pattern
     * and all the threads will get different instances of the singleton class
    */
    public static LazyInitializationSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitializationSingleton();
        }
        return instance;
    }
}
