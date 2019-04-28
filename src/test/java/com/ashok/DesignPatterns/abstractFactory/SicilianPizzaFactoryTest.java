package com.ashok.DesignPatterns.abstractFactory;

import org.junit.Test;
public class SicilianPizzaFactoryTest {

    @Test
    public void testCreatePizza() throws Exception {
        BasePizzaFactory pizzaFactory=new SicilianPizzaFactory();
        Pizza cheesePizza=pizzaFactory.createPizza("cheese");
        Pizza pepperoniPizza =pizzaFactory.createPizza("pepperoni");
    }
}
