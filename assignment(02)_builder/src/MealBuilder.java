public class MealBuilder {
    private String burger;
    private String drink;
    private String fries;

    public MealBuilder setBurger(String burger) {
        this.burger = burger;
        return this;
    }

    public MealBuilder setDrink(String drink) {
        this.drink = drink;
        return this;
    }

    public MealBuilder setFries(String fries) {
        this.fries = fries;
        return this;
    }

    public Meal makeMeal() {
        return new Meal(burger, drink, fries);
    }
}
