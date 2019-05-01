package com.ashok.DesignPatterns.abstractFactory;
import com.ashok.DesignPatterns.abstractFactory.product.PepperoniPizza;
import com.ashok.DesignPatterns.abstractFactory.product.Pizza;
import com.ashok.DesignPatterns.abstractFactory.product.VeggiePizza;
import com.ashok.DesignPatterns.abstractFactory.product.CheesePizza;

/**
 * Created by ashok jung bahadur
 */

public class SicilianPizzaFactory extends BasePizzaFactory {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        BaseToppingFactory toppingFactory = new SicilianToppingFactory();
        switch (type.toLowerCase()) {
            case "cheese":
                pizza = new CheesePizza(toppingFactory);
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(toppingFactory);
                break;
            case "veggie":
                pizza = new VeggiePizza(toppingFactory);
                break;
            default:
                throw new IllegalArgumentException("No such pizza.");
        }

        pizza.addIngredients();
        pizza.bakePizza();
        return pizza;
    }
}