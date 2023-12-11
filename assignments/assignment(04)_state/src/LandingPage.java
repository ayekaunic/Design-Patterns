public class LandingPage extends State{

    @Override
    public State NextState(int choice) {

        if(choice == 0){
            return new Register();
        }
        else if(choice == 1){
            return new HomePage();
        }
        else{
            throw new RuntimeException("Invalid Option");
        }
    }

    @Override
    public State PreviousState() {
        throw new RuntimeException("This is Not Possible");
    }

    @Override
    public void PrintString() {
        System.out.println("LandingPage");
    }

    @Override
    public void StateNextOptions() {
        System.out.println("0) Register \n1)Login\n");
    }



}
