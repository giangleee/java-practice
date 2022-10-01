import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Pizza pizza1 = new Pizza("thicc crust", "tomato", "mozzerella", "pepperoni");
        Pizza pizza2 = new Pizza("thicc crust", "tomato", "mozzerella");
        Pizza pizza3 = new Pizza("thicc crust", "tomato");

        ArrayList<Pizza> CombinePizza = new ArrayList<Pizza>();
        CombinePizza.add(pizza1);
        CombinePizza.add(pizza2);
        CombinePizza.add(pizza3);

        // System.out.println(CombinePizza);

        Garage garage = new Garage();
        Car mycar = new Car("Subishi");

        garage.park(mycar);
    }
}
