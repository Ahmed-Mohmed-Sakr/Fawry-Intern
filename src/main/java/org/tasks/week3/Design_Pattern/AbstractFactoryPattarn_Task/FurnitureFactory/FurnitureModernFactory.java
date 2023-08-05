package org.tasks.week3.Design_Pattern.AbstractFactoryPattarn_Task.FurnitureFactory;

import org.tasks.week3.Design_Pattern.AbstractFactoryPattarn_Task.Furniture;
import org.tasks.week3.Design_Pattern.AbstractFactoryPattarn_Task.FurnitureTypes;
import org.tasks.week3.Design_Pattern.AbstractFactoryPattarn_Task.chairs.ChairModern;
import org.tasks.week3.Design_Pattern.AbstractFactoryPattarn_Task.coffeeTables.CoffeeTableModern;
import org.tasks.week3.Design_Pattern.AbstractFactoryPattarn_Task.sofas.SofaModern;

public class FurnitureModernFactory extends FurnitureAbstractFactory {


    @Override
    public  Furniture CreateFurniture(FurnitureTypes types) {
        switch (types){
            case Chair:
                return new ChairModern();
            case Sofa:
                return new SofaModern();
            case coffeeTable:
                return new CoffeeTableModern();
            default:
                return null;
        }
    }
}
