package com.ashok.DesignPatterns.builder.builders;

import com.ashok.DesignPatterns.builder.product.House;

/**
 * Created by ashok jung bahadur
 */

public interface HouseBuilder {
    void buildFoundation();
    void buildStructure();
    void buildRoof();
    void paintHouse();
    void furnishHouse();
    House getHouse();
}
