public class Buy extends State {

    @Override
    public State NextState(int choice) {
        System.out.println("Item Purchased");
        return null;
    }

    @Override
    public State PreviousState() {
        return new ViewCart();
    }

    @Override
    public void PrintString() {
        System.out.println("Payment Section");
    }

    @Override
    public void StateNextOptions() {
        System.out.println("Item purchased, enter 1 to complete checkout!");
    }
}
