import java.util.ArrayList;

public abstract class Subject {
    protected ArrayList<Observer> observers = new ArrayList<Observer>();
    
    public abstract void attach(Observer observer);
    public abstract void detach(Observer observer);
    public abstract void notifyObservers();

    public abstract int[] getState();
}
