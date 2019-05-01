package com.ashok.DesignPatterns.abstractFactory.topping;
/**
 * Created by ashok jung bahadur
 */
public class TomatoSauce implements Sauce {

    public TomatoSauce()
    {
        prepareSauce();
    }

    @Override
    public void prepareSauce()
    {
        System.out.println("Preparing tomato sauce..");
    }
}
