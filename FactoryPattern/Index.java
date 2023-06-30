package FactoryPattern;

import FactoryPattern.BasePizzaClass.PizzaStore;
import FactoryPattern.Franchises.BaseNYStyleFranchise.NYFranchise;

public class Index {
    public static void main(String[] args) {
        PizzaStore myPizza = new NYFranchise();
        System.out.println(myPizza.orderPizza("Cheese").getDescription());
    }
}
