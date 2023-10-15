public class MealBuilder {
    
    public Meal prepareVegMealWithCan (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke("Can"));
        return meal;
    }

    public Meal prepareVegMealWithBottle (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke("Bottle"));
        return meal;
    }

    public Meal prepareNonVegMealWithCan (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi("Can"));
        return meal;
    }

    public Meal prepareNonVegMealWithBottle (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi("Bottle"));
        return meal;
    }
}
