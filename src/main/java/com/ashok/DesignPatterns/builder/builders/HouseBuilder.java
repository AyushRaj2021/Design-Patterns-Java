package com.ashok.DesignPatterns.builder.builders;

import com.ashok.DesignPatterns.builder.product.House;

public interface HouseBuilder {
    void buildFoundation();
    void buildStructure();
    void buildRoof();
    void paintHouse();
    void furnishHouse();
    House getHouse();
}
