package com.ashok.DesignPatterns.factoryMethod;

/**
 * Created by ashok jung bahadur
 */

public class VeggiePizza extends Pizza {

    @Override

    public void addIngredients()
    {
        System.out.println("Preparing ingredients for veggie pizza.");
    }
}
