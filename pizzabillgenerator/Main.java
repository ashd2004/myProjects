package bill;

import java.util.*;

public class Main {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        System.out.println("--------------------------Welcome to Ashish's Pizza--------------------------");
        System.out.println("Which Pizza: (1.Veg Pizza  2.Non-Veg Pizza  3. Deluxe Veg Pizza  4. Deluxe Non-Veg Pizza)");

        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                Pizza vegPizza = new Pizza(true);
                vegPizza.addExtraToppings();
                vegPizza.addExtraCheese();
                vegPizza.takeAway();
                vegPizza.getBill();
                break;
            case 2:
                Pizza nonVegPizza = new Pizza(false);
                nonVegPizza.addExtraToppings();
                nonVegPizza.addExtraCheese();
                nonVegPizza.takeAway();
                nonVegPizza.getBill();
                break;
            case 3:
                DeluxePizza veg = new DeluxePizza(true);
                veg.addExtraToppings();
                veg.addExtraCheese();
                veg.takeAway();
                veg.getBill();
                break;
            case 4:
                DeluxePizza nonVeg = new DeluxePizza(false);
                nonVeg.addExtraToppings();
                nonVeg.addExtraCheese();
                nonVeg.takeAway();
                nonVeg.getBill();
                break;
            default:
                System.out.println("Sorry. Enter Again!");
                return;
        }
        // sc.close();
    }
}
