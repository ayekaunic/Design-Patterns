public class Demo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        
        Meal vegMeal = mealBuilder.prepareVegMealWithBottle();
        System.out.println("Veg Meal with Bottle");
        vegMeal.showItems();
        System.out.println("Total Cost: " +vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMealWithCan();
        System.out.println("\n\nNon-Veg Meal with Can");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " +nonVegMeal.getCost());
    }

    /*
       expected output upon running:
       Veg Meal with Bottle
       Item : Veg Burger, Packing : Wrapper, Price : 25.0    
       Item : Coke, Packing : Bottle, Price : 30.0
       Total Cost: 55.0


       Non-Veg Meal with Can
       Item : Chicken Burger, Packing : Wrapper, Price : 50.5
       Item : Pepsi, Packing : Can, Price : 40.0
       Total Cost: 90.5
    */
}
