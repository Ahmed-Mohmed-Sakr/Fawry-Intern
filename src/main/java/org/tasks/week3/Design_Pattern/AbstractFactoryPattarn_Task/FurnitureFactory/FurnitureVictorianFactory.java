package org.tasks.week3.Design_Pattern.AbstractFactoryPattarn_Task.FurnitureFactory;

import org.tasks.week3.Design_Pattern.AbstractFactoryPattarn_Task.Furniture;
import org.tasks.week3.Design_Pattern.AbstractFactoryPattarn_Task.FurnitureTypes;
import org.tasks.week3.Design_Pattern.AbstractFactoryPattarn_Task.chairs.ChairVictorian;
import org.tasks.week3.Design_Pattern.AbstractFactoryPattarn_Task.coffeeTables.CoffeeTableVictorian;
import org.tasks.week3.Design_Pattern.AbstractFactoryPattarn_Task.sofas.SofaVictorian;

public class FurnitureVictorianFactory extends FurnitureAbstractFactory {


    @Override
    public  Furniture CreateFurniture(FurnitureTypes types) {
        switch (types){
            case Chair:
                return new ChairVictorian();
            case Sofa:
                return new SofaVictorian();
            case coffeeTable:
                return new CoffeeTableVictorian();
            default:
                return null;
        }
    }
}
