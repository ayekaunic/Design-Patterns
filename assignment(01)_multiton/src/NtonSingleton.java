// This class implements an n-ton singleton pattern, which allows you to create
// a limited number of instances of a class, where n is the maximum number
// of instances.

public class NtonSingleton {

    // The maximum number of instances that can be created.
    private static Integer numOfInstances;

    // An array to store the instances of the class.
    private static NtonSingleton NTons[];
    
    // A counter to track the number of instances that have been created.
    private static  int counter = 0;

    // An identifier to identify the instance.
    private int ntonIdentifier;

    // Private constructor for NtonSingleton
    private NtonSingleton() {}
        

    // Method to set the maximum number of instances that can be created.
    public static void setNumOfInstances(int num){
        numOfInstances = num;
        NTons = new NtonSingleton[num];
    }

    // Method to get an instance of the class. If there are fewer than the maximum
    // number of instances created, a new instance is created and returned.
    // Otherwise, the most recently created instance is returned.
    public static NtonSingleton getInstance(){
        if(counter < numOfInstances){
            NTons[counter] = new NtonSingleton();
            counter++;
            NTons[counter-1].ntonIdentifier = counter;
        }
        else{
            counter++;
        }
        return NTons[(counter-1) % numOfInstances];
    }

    // Method to get the identifier of this instance.
    public int getIdentifier(){
        return ntonIdentifier;
    }
}
