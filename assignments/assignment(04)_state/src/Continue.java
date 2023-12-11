public class Continue  extends State{

    @Override
    public State NextState(int choice) {
        if(choice == 0){
            return new ViewCart();
        }
        else if(choice == 1){
            return new SearchPage();
        }
        else{
            throw new RuntimeException("Invalid Option");
        }
    }

    @Override
    public State PreviousState() {
        return new AddToCart();
    }

    @Override
    public void PrintString() {
        System.out.println("Continue State");

    }

    @Override
    public void StateNextOptions() {
        System.out.println("\n0) View Cart\n1) Search Page\n");
    }
}
