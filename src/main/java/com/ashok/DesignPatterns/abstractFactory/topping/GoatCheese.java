package com.ashok.DesignPatterns.abstractFactory.topping;
/**
 * Created by ashok jung bahadur
 */
public class GoatCheese implements  Cheese {


    public GoatCheese()
    {
        prepareCheese();
    }

    @Override
    public void prepareCheese()
    {
        System.out.println("Preparing goat cheese...");
    }
}
