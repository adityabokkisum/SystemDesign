package FactoryPattern.Franchises.BaseNYStyleFranchise.PizzaVarieties;

import FactoryPattern.BasePizzaClass.Pizza;
import FactoryPattern.Franchises.BaseNYStyleFranchise.NYIngrediantFactory;

public class NYCheesePizza extends Pizza {
    private final NYIngrediantFactory factory;
    public NYCheesePizza(NYIngrediantFactory factory) {
        this.factory = factory;
        name = "I am a THIN COOL NY CHEESE PIZZA";
        toppings.add("Olive");
    }
    @Override
    public void prepare() {
    dough = this.factory.createDough();
    cheese = factory.createCheese();
    pepperoni = factory.createPepperoni();
    sauce = factory.createSauce();
    veggies = factory.createVeggies();
    System.out.println("HOT HOT NY CHEESE PIZZA HAS BEEN DONE FOR YOU :)");
    }
}
