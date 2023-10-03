package pizza;

public class Test {
    public static void main(String[] args) {
        PizzaBuilder chef = new PizzaBuilder();
        chef.chooseFlavor("tikka");
        chef.chooseSlices(0);
        Pizza tikka = chef.bakePizza();
        System.out.println(tikka.describe());
        chef.chooseSlices(6);
        Pizza fajita = chef.bakePizza();
        System.out.println(fajita.describe());
    }
}
