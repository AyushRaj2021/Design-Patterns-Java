package com.ashok.DesignPatterns.factoryMethod;
/**
 * Created by ashok jung bahadur
 */

public class PepperoniPizza  extends Pizza
{
    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for pepperoni pizza.");
    }
}
