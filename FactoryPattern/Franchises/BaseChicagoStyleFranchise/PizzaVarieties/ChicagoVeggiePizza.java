package FactoryPattern.Franchises.BaseChicagoStyleFranchise.PizzaVarieties;

import FactoryPattern.BasePizzaClass.Pizza;
import FactoryPattern.Franchises.BaseChicagoStyleFranchise.ChicagoIngrediantFactory;

public class ChicagoVeggiePizza extends Pizza {
    private final ChicagoIngrediantFactory factory;
    public ChicagoVeggiePizza(ChicagoIngrediantFactory factory) {
        this.factory = factory;
        name = "I am a FAT HOT CHICAGO VEGGIE PIZZA";
        toppings.add("Peperoni");
    }

    @Override
    public void prepare() {
        dough = factory.createDough();
        sauce =factory.createSauce();
        veggies =factory.createVeggies();
        pepperoni = factory.createPepperoni();
        System.out.println("VERY THICK AND YUMMY CHICAGO VEG PIZZA IS READY");
    }
}
