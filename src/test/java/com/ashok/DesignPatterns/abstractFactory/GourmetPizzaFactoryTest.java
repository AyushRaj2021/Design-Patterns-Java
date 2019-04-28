package com.ashok.DesignPatterns.abstractFactory;
import com.ashok.DesignPatterns.abstractFactory.product.Pizza;

import org.junit.Test;

/**
 * Created by ashok jung bahadur
 */

public class GourmetPizzaFactoryTest {

    @Test
    public void testCreatePizza() throws Exception {
        BasePizzaFactory pizzaFactory=new GourmetPizzaFactory();
        Pizza cheesePizza= pizzaFactory.createPizza("cheese");
        Pizza veggiePizza=pizzaFactory.createPizza("veggie");
    }
}
