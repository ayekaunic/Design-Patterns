public class ViewCart extends State{

    @Override
    public State NextState(int choice) {
        if(choice == 0){
            return new Buy();
        }
        else if(choice == 1){
            System.out.println("Item Removed");
            return new HomePage();
        }
        else{
            throw new RuntimeException("Invalid Option");
        }

    }

    @Override
    public State PreviousState() {
        return new SearchPage();
    }

    @Override
    public void PrintString() {
        System.out.println("View Cart");

    }

    @Override
    public void StateNextOptions() {
        System.out.println("0) Buy \n1) Home Page\n");
    }
}
