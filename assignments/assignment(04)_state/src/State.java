public abstract class State {
     public abstract State NextState(int choice);
     public abstract State PreviousState();
     public abstract void PrintString();
     public abstract void StateNextOptions();
}
