package FactoryPattern.Franchises.BaseNYStyleFranchise.PizzaVarieties;

import FactoryPattern.BasePizzaClass.BaseIngredients.*;
import FactoryPattern.BasePizzaClass.Pizza;
import FactoryPattern.Franchises.BaseNYStyleFranchise.NYIngrediantFactory;

public class NYVeggiePizza extends Pizza {
    private final NYIngrediantFactory factory;

    public NYVeggiePizza(NYIngrediantFactory factory) {
        this.factory = factory;
        name = "I am a THIN COOL NY Veggie PIZZA";
        toppings.add("Olive");
    }

    @Override
    public void prepare() {
        dough = factory.createDough();
        cheese = factory.createCheese();
        pepperoni = factory.createPepperoni();
        sauce = factory.createSauce();
        veggies = factory.createVeggies();
        System.out.println("HOT HOT New York Styled PIZZA as been prepared");
    }
}
