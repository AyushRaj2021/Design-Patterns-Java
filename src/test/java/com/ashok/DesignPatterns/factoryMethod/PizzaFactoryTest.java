package com.ashok.DesignPatterns.factoryMethod;

import org.junit.Test;

public class PizzaFactoryTest {

    @Test
    public void testMakePizzas()
    {
        BasePizzaFactory pizzaFactory = new PizzaFactory();
        Pizza chessepizza = pizzaFactory.createPizza("cheese");
        Pizza veggiepizza =pizzaFactory.createPizza("veggie");
        Pizza pepperonipizza = pizzaFactory.createPizza("pepperoni");
    }
}
