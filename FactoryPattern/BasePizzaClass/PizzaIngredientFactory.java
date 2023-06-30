package FactoryPattern.BasePizzaClass;

import FactoryPattern.BasePizzaClass.BaseIngredients.*;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();

}
