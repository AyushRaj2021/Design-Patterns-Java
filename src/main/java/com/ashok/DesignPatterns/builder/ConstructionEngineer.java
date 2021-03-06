package com.ashok.DesignPatterns.builder;

import com.ashok.DesignPatterns.builder.builders.HouseBuilder;
import com.ashok.DesignPatterns.builder.product.House;

/**
 * Created by ashok jung bahadur
 */

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
