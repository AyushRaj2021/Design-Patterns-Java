package com.ashok.DesignPatterns.abstractFactory;
import com.ashok.DesignPatterns.abstractFactory.product.Pizza;

/**
 * Created by ashok jung bahadur
 */

public abstract class BasePizzaFactory {

    public abstract Pizza createPizza(String type);
}
