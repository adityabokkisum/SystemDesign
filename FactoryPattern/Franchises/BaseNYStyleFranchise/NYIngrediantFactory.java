package FactoryPattern.Franchises.BaseNYStyleFranchise;

import FactoryPattern.BasePizzaClass.BaseIngredients.*;
import FactoryPattern.BasePizzaClass.PizzaIngredientFactory;
import FactoryPattern.Franchises.BaseNYStyleFranchise.BaseNYIngredients.*;
import FactoryPattern.Franchises.BaseNYStyleFranchise.BaseNYIngredients.FreshVeggies.Garlic;
import FactoryPattern.Franchises.BaseNYStyleFranchise.BaseNYIngredients.FreshVeggies.Onion;

public class NYIngrediantFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new RegianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies v[] =  {new Onion(),new Garlic()};
        return  v;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }
}
