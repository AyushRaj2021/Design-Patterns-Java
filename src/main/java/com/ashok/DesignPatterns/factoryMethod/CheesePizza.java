package com.ashok.DesignPatterns.factoryMethod;

/**
 * Created by ashok jung bahadur
 */

public class CheesePizza extends Pizza {

    @Override
    public void addIngredients()
    {
        System.out.println("Preparing ingredients for cheese pizza.");
    }
}
