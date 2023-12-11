public class SearchPage extends State{
    @Override
    public State NextState(int choice) {
        if(choice == 0){
            return new AddToCart();
        }
        else if(choice == 1){
            return new HomePage();
        }
        else{
            throw new RuntimeException("Invalid option");
        }
    }

    @Override
    public State PreviousState() {
        return new HomePage();
    }

    @Override
    public void PrintString() {
        System.out.println("Search Page");

    }

    @Override
    public void StateNextOptions() {
        System.out.println("0) Add to Cart \n1) HomePage\n");
    }
}
