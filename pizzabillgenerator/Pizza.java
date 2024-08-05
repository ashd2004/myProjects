package bill;

import java.util.*;

public class Pizza {
    protected int price;
    private boolean veg;

    protected int extraCheesePrice = 100;
    protected int extraToppingsPrice = 150;
    protected int backPackPrice = 20;

    protected int basePizzaPrice;

    protected boolean isExtraCheeseAdded = false;  // Changed to protected
    protected boolean isExtraToppingsAdded = false;  // Changed to protected
    protected boolean isOptedForTakeaway = false;

    Scanner in = new Scanner(System.in);

    public Pizza(boolean veg) {
        this.veg = veg;

        if (this.veg) {
            this.price = 300;
        } else {
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }

    public void addExtraCheese() {
        System.out.println("Extra Cheese (y/n)? =>");
        char ch = Character.toLowerCase(in.next().charAt(0));
        if (ch == 'y') {
            isExtraCheeseAdded = true;
            this.price += extraCheesePrice;
        } else if (ch == 'n') {
            isExtraCheeseAdded = false;
        }
    }

    public void addExtraToppings() {
        System.out.println("Extra Toppings (y/n)? =>");
        char ch = Character.toLowerCase(in.next().charAt(0));
        if (ch == 'y') {
            isExtraToppingsAdded = true;
            this.price += extraToppingsPrice;
        } else if (ch == 'n') {
            isExtraToppingsAdded = false;
        }
    }

    public void takeAway() {
        System.out.println("Want Takeaway (y/n)? =>");
        char ch = Character.toLowerCase(in.next().charAt(0));
        if (ch == 'y') {
            isOptedForTakeaway = true;
            this.price += backPackPrice;
        } else if (ch == 'n') {
            isOptedForTakeaway = false;
        }
    }

    public void getBill() {
        String bill = "";

        System.out.println("Pizza: " + basePizzaPrice);
        if (isExtraCheeseAdded) {
            bill += "Extra Cheese: " + extraCheesePrice + "\n";
        }
        if (isExtraToppingsAdded) {
            bill += "Extra Toppings: " + extraToppingsPrice + "\n";
        }
        if (isOptedForTakeaway) {
            bill += "Take away: " + backPackPrice + "\n";
        }
        bill += "\nTotal Amount: " + this.price + "\n";

        System.out.println(bill);
        System.out.println("\n\n\nThank You!!! Visit Again :)");
        System.out.println("---------------------------------------------------------");
    }
}
