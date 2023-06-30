package FactoryPattern.Franchises.BaseChicagoStyleFranchise;

import FactoryPattern.BasePizzaClass.Pizza;
import FactoryPattern.BasePizzaClass.PizzaStore;
import FactoryPattern.Franchises.BaseChicagoStyleFranchise.PizzaVarieties.ChicagoCheesePizza;
import FactoryPattern.Franchises.BaseChicagoStyleFranchise.PizzaVarieties.ChicagoVeggiePizza;

public class ChicagoFranchise extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        if (type == "Veggie") {
            return new ChicagoVeggiePizza(new ChicagoIngrediantFactory());
        } else if(type == "Cheese") {
            return new ChicagoCheesePizza(new ChicagoIngrediantFactory());
        } else return null;
    }
}
