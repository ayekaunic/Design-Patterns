public class Meal {
    private String burger;
    private String drink;
    private String fries;

    public Meal(String burger, String drink, String fries) {
        this.burger = burger;
        this.drink = drink;
        this.fries = fries;
    }

    public void describe() {
        System.out.println("\nBurger: " + burger + ", Drink: " + drink + ", Fries: " + fries + "\n");
    }
}
