package com.ashok.DesignPatterns.abstractFactory.product;
import com.ashok.DesignPatterns.abstractFactory.BaseToppingFactory;
/**
 * Created by ashok jung bahadur
 */

public class CheesePizza extends Pizza {

    BaseToppingFactory baseToppingFactory ;

    public CheesePizza(BaseToppingFactory baseToppingFactory)
    {
        this.baseToppingFactory = baseToppingFactory;
    }

    @Override
    public void addIngredients ()
    {
        System.out.println("Preparing ingredients for cheese pizza.");
        baseToppingFactory.createCheese();
        baseToppingFactory.createSauce();
    }


}
