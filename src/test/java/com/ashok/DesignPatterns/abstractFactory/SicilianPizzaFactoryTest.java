package com.ashok.DesignPatterns.abstractFactory;

import com.ashok.DesignPatterns.abstractFactory.product.Pizza;


import org.junit.Test;

/**
 * Created by ashok jung bahadur
 */

public class SicilianPizzaFactoryTest {

    @Test
    public void testCreatePizza() throws Exception {
        BasePizzaFactory pizzaFactory=new SicilianPizzaFactory();
        Pizza cheesePizza=pizzaFactory.createPizza("cheese");
        Pizza pepperoniPizza =pizzaFactory.createPizza("pepperoni");


    }
}
