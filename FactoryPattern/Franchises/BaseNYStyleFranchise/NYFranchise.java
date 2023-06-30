package FactoryPattern.Franchises.BaseNYStyleFranchise;

import FactoryPattern.BasePizzaClass.Pizza;
import FactoryPattern.BasePizzaClass.PizzaStore;
import FactoryPattern.Franchises.BaseNYStyleFranchise.PizzaVarieties.NYCheesePizza;
import FactoryPattern.Franchises.BaseNYStyleFranchise.PizzaVarieties.NYVeggiePizza;

public class NYFranchise extends PizzaStore {
    public Pizza createPizza(String type) {
        if (type == "Veggie") {
            return new NYVeggiePizza(new NYIngrediantFactory());
        } else if(type == "Cheese") {
            return new NYCheesePizza(new NYIngrediantFactory());
        } else return null;
    }
}
