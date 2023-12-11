public class AddToCart extends State{

    @Override
    public State NextState(int choice) {
        if(choice == 0){
            return new SearchPage();
        }
        else if(choice == 1){
            return new Continue();
        }
        else{
            throw new RuntimeException("Invalid Operation!");
        }
    }

    @Override
    public State PreviousState() {
        return new SearchPage();
    }

    @Override
    public void PrintString() {
        System.out.println("Add To Cart");

    }

    @Override
    public void StateNextOptions() {
        System.out.println("\n0) Search Page 1) Continue\n");
    }
}
