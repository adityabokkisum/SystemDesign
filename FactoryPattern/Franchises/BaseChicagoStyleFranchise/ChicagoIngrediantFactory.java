package FactoryPattern.Franchises.BaseChicagoStyleFranchise;

import FactoryPattern.BasePizzaClass.BaseIngredients.*;
import FactoryPattern.BasePizzaClass.PizzaIngredientFactory;
import FactoryPattern.Franchises.BaseChicagoStyleFranchise.baseChicagoIngridients.FreshVeggies.SoyGarlic;
import FactoryPattern.Franchises.BaseChicagoStyleFranchise.baseChicagoIngridients.FreshVeggies.VenigerOnion;
import FactoryPattern.Franchises.BaseChicagoStyleFranchise.baseChicagoIngridients.MozarellaCheese;
import FactoryPattern.Franchises.BaseChicagoStyleFranchise.baseChicagoIngridients.PlumTomatoSauce;
import FactoryPattern.Franchises.BaseChicagoStyleFranchise.baseChicagoIngridients.ThickCrustDough;
import FactoryPattern.Franchises.BaseNYStyleFranchise.BaseNYIngredients.ThinCrustDough;

public class ChicagoIngrediantFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new SoyGarlic(),new VenigerOnion()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return null;
    }
}
