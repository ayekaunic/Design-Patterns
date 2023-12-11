public class Register extends State{

    @Override
    public State NextState(int choice) {
        if(choice == 0)
        return new HomePage();
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
        System.out.println("Register");
    }

    @Override
    public void StateNextOptions() {
        System.out.println("0) Home Page \n");
    }

}
