package com.ashok.DesignPatterns.abstractFactory.topping;

/**
 * Created by ashok jung bahadur
 */

public class MozzarellaCheese implements Cheese {

    public MozzarellaCheese()
    {
        prepareCheese();
    }

    @Override
    public void prepareCheese()
    {
        System.out.println("Preparing mozzarella cheese...");
    }
}
