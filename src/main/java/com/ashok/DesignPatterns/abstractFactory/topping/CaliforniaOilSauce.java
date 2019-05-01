package com.ashok.DesignPatterns.abstractFactory.topping;
/**
 * Created by ashok jung bahadur
 */

public class CaliforniaOilSauce implements Sauce {
    public CaliforniaOilSauce() {
        prepareSauce();
    }

    @Override
    public void prepareSauce() {
        System.out.println("Preparing california oil sauce..");
    }

}