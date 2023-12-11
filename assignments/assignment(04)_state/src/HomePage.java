public class HomePage extends State{

    @Override
    public State NextState(int choice) {
        if(choice == 0){
            return new SearchPage();
        }
        else if(choice == 1){
            return new ViewCart();
        }
        else{
            throw new RuntimeException("Invalid option");
        }
    }

    @Override
    public State PreviousState() {
        return new LandingPage();
    }

    @Override
    public void PrintString() {

        System.out.println("HomePage");

    }

    @Override
    public void StateNextOptions() {
        System.out.println("\n0) Search Page \n1) View Cart\n");

    }

}
