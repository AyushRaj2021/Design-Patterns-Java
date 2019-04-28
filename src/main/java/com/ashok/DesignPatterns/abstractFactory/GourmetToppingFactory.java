package com.ashok.DesignPatterns.abstractFactory;

import com.ashok.DesignPatterns.abstractFactory.topping.Sauce;
import com.ashok.DesignPatterns.abstractFactory.topping.Cheese;
import com.ashok.DesignPatterns.abstractFactory.topping.CaliforniaOilSauce;
import com.ashok.DesignPatterns.abstractFactory.topping.GoatCheese;

/**
 * Created by ashok jung bahadur
 */

public class GourmetToppingFactory extends BaseToppingFactory {

    @Override
    public Cheese createCheese(){ return new GoatCheese();}



    @Override
    public Sauce createSauce(){return new CaliforniaOilSauce();}
}
