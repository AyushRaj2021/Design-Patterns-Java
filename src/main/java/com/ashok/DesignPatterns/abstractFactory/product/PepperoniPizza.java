package com.ashok.DesignPatterns.abstractFactory.product;
import com.ashok.DesignPatterns.abstractFactory.BaseToppingFactory;
/**
 * Created by ashok jung bahadur
 */


public class PepperoniPizza extends Pizza{

    BaseToppingFactory baseToppingFactory;

    public PepperoniPizza(BaseToppingFactory baseToppingFactory)
    {
        this.baseToppingFactory =baseToppingFactory;
    }

    @Override
    public void addIngredients()
    {
        System.out.println("Preparing ingredients for Pepperoni pizza.");
        baseToppingFactory.createCheese();
        baseToppingFactory.createSauce();
    }
}
