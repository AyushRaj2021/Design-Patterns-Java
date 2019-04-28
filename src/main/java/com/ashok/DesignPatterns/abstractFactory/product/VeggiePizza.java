package com.ashok.DesignPatterns.abstractFactory.product;

import com.ashok.DesignPatterns.abstractFactory.BaseToppingFactory;

/**
 * Created by ashok jung bahadur
 */

public class VeggiePizza extends Pizza{

    BaseToppingFactory baseToppingFactory;

    public VeggiePizza(BaseToppingFactory baseToppingFactory)
    {
        this.baseToppingFactory =baseToppingFactory;
    }

    @Override
    public void addIngredients()
    {
        System.out.println("Preparing ingredients for veggie pizza.");
        baseToppingFactory.createCheese();
        baseToppingFactory.createSauce();
    }
}
