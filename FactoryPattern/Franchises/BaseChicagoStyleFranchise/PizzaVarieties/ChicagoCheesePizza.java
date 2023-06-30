package FactoryPattern.Franchises.BaseChicagoStyleFranchise.PizzaVarieties;

import FactoryPattern.BasePizzaClass.Pizza;
import FactoryPattern.Franchises.BaseChicagoStyleFranchise.ChicagoIngrediantFactory;

public class ChicagoCheesePizza extends Pizza {
    private final ChicagoIngrediantFactory factory;
   public ChicagoCheesePizza(ChicagoIngrediantFactory factory) {
        this.factory = factory;
       name = "I am a FAT HOT CHICAGO CHEESE PIZZA";
       toppings.add("Sausages");
   }


    @Override
    public void prepare() {
        dough = factory.createDough();
        sauce =factory.createSauce();
        veggies =factory.createVeggies();
        pepperoni = factory.createPepperoni();
        System.out.println("VERY THICK AND YUMMY CHICAGO CHEESE PIZZA IS READY");
    }
}
