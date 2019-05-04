package com.ashok.DesignPatterns.builder.director;

import com.ashok.DesignPatterns.builder.builders.HouseBuilder;
import com.ashok.DesignPatterns.builder.product.House;
public class ConstructionEngineer {

    private HouseBuilder houseBuilder;

    public ConstructionEngineer(HouseBuilder houseBuilder)
    {
        this.houseBuilder =houseBuilder;
    }

    public House ConstructHouse()
    {
      this.houseBuilder.buildFoundation();
      this.houseBuilder.buildStructure();
      this.houseBuilder.buildRoof();
      this.houseBuilder.paintHouse();
      this.houseBuilder.furnishHouse();

      return this.houseBuilder.getHouse();

    }
}
