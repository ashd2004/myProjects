package bill;

public class DeluxePizza extends Pizza {
    public DeluxePizza(Boolean veg) {
        super(veg);
        // Automatically add extra cheese and toppings for DeluxePizza
        addExtraCheese();
        addExtraToppings();
    }

    @Override
    public void addExtraCheese() {
        if (!isExtraCheeseAdded) { // Only add extra cheese price if not already added
            this.price += extraCheesePrice;
            isExtraCheeseAdded = true;
        }
    }

    @Override
    public void addExtraToppings() {
        if (!isExtraToppingsAdded) { // Only add extra toppings price if not already added
            this.price += extraToppingsPrice;
            isExtraToppingsAdded = true;
        }
    }
}
