package FactoryPattern.BasePizzaClass;

import FactoryPattern.BasePizzaClass.BaseIngredients.*;

import java.util.ArrayList;

public abstract class Pizza {
    public String name;
    public Dough dough;
    public Cheese cheese;
    public Pepperoni pepperoni;
    public Sauce sauce;
    public Veggies[] veggies;
    public ArrayList<String> toppings = new ArrayList<String>();

    public abstract void prepare();
    public void cut() {
        System.out.println("Pizza has been cut");
    }
    public void box() {
        System.out.println("Pizza has been boxed");
    }
    public String getDescription() {
        return name;
    }
}
