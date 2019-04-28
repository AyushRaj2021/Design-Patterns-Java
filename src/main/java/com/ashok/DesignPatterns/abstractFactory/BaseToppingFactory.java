package com.ashok.DesignPatterns.abstractFactory;

import com.ashok.DesignPatterns.abstractFactory.topping.Cheese;
import com.ashok.DesignPatterns.abstractFactory.topping.Sauce;

/**
 * Created by ashok jung bahadur
 */

public abstract class BaseToppingFactory {

    public abstract Cheese createCheese();
    public abstract Sauce createSauce();

}
