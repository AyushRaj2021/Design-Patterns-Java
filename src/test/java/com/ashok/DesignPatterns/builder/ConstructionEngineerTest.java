package com.ashok.DesignPatterns.builder;
import org.junit.Test;

import com.ashok.DesignPatterns.builder.product.House;
import com.ashok.DesignPatterns.builder.builders.HouseBuilder;
import com.ashok.DesignPatterns.builder.builders.ConcreteHouseBuilder;
import com.ashok.DesignPatterns.builder.builders.PrefabricatedHouseBuilder;

/**
 * Created by ashok jung bahadur
 */

public class ConstructionEngineerTest {

    @Test
    public void testConstructHouse() throws Exception {
        HouseBuilder concreteHouseBuilder = new ConcreteHouseBuilder();
        ConstructionEngineer engineerA = new ConstructionEngineer(concreteHouseBuilder);
        House houseA = engineerA.ConstructHouse();
        System.out.println("House is: "+houseA);
        PrefabricatedHouseBuilder prefabricatedHouseBuilder = new PrefabricatedHouseBuilder();
        ConstructionEngineer engineerB = new ConstructionEngineer(prefabricatedHouseBuilder);
        House houseB = engineerB.ConstructHouse();
        System.out.println("House is: "+houseB);
    }
}
