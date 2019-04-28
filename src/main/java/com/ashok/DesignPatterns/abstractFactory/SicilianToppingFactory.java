package com.ashok.DesignPatterns.abstractFactory;

import com.ashok.DesignPatterns.abstractFactory.topping.Sauce;
import com.ashok.DesignPatterns.abstractFactory.topping.TomatoSauce;
import com.ashok.DesignPatterns.abstractFactory.topping.MozzarellaCheese;
import com.ashok.DesignPatterns.abstractFactory.topping.Cheese;

/**
 * Created by ashok jung bahadur
 */

public class SicilianToppingFactory extends BaseToppingFactory{
    @Override
    public  Cheese createCheese(){return new MozzarellaCheese();}
    @Override
    public  Sauce createSauce(){return new TomatoSauce();}
}