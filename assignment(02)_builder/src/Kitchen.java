public class Kitchen {
    public static void main(String[] args) {
        
        // meal-builder aka chef
        MealBuilder chef = new MealBuilder();
        
        // chicken burger + coke
        chef.setBurger("Chicken Burger");
        chef.setDrink("Coke");
        Meal meal1 = chef.makeMeal();

        // veg burger + coke
        chef.setBurger("Veg Burger");
        Meal meal2 = chef.makeMeal();

        // veg burger + pepsi
        chef.setDrink("Pepsi");
        Meal meal3 = chef.makeMeal();

        // chicken burger + pepsi
        chef.setBurger("Chicken Burger");
        Meal meal4 = chef.makeMeal();

        // describing all the meals
        meal1.describe();
        meal2.describe();
        meal3.describe();
        meal4.describe();
    }
}
