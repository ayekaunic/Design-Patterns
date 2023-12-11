import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Context ShoppingStore = new Context();

        ShoppingStore.setState(new LandingPage());

        int userInput;

        while (true) {
            State currentState = ShoppingStore.getState();
            currentState.PrintString();
            System.out.print("Enter What you want to do? \n1)Go Forward \n2)Go Back\n3)Exit\n");
            if (scanner.hasNextInt()) {
                userInput = scanner.nextInt();


                if(userInput == 1){
                    Scanner ChoiceScanner = new Scanner(System.in);
                    int userInputChoice;

                    while(true){

                        System.out.println("Enter the operation you want to perform");
                        currentState.StateNextOptions();
                        try{
                            if(scanner.hasNextInt()){
                                userInputChoice = scanner.nextInt();

                                ShoppingStore.setState(currentState.NextState(userInputChoice));
                                break;
                            }
                            else{
                                System.out.println("Invalid input. Please enter an integer.");
                                scanner.next();
                            }
                        }
                        catch (Exception e){
                            System.out.println(e);
                        }
                    }
                }
                else if(userInput == 2){

                    try {
                        ShoppingStore.setState(currentState.PreviousState());
                    }catch (Exception e){
                        System.out.println(e);
                    }

                }
                else if(userInput == 3){
                    break;
                }
                else{
                    System.out.println("Please select the correct option");
                }
                if(ShoppingStore.getState() == null){
//                    break;
                    System.exit(0);
                }

            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next();
            }
        }

        System.out.println("Exited.");
        scanner.close();
    }
}