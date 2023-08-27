package org.tasks.week3.Creational_Design_Pattern.AbstractFactoryPattarn_Task.FurnitureFactory;

import org.tasks.week3.Creational_Design_Pattern.AbstractFactoryPattarn_Task.Furniture;
import org.tasks.week3.Creational_Design_Pattern.AbstractFactoryPattarn_Task.FurnitureTypes;
import org.tasks.week3.Creational_Design_Pattern.AbstractFactoryPattarn_Task.chairs.ChairArt;
import org.tasks.week3.Creational_Design_Pattern.AbstractFactoryPattarn_Task.coffeeTables.CoffeeTableArt;
import org.tasks.week3.Creational_Design_Pattern.AbstractFactoryPattarn_Task.sofas.SofaArt;

public class FurnitureArtFactory extends FurnitureAbstractFactory {


    @Override
    public Furniture CreateFurniture(FurnitureTypes types) {
        switch (types){
            case Chair:
                return new ChairArt();
            case Sofa:
                return new SofaArt();
            case coffeeTable:
                return new CoffeeTableArt();
            default:
                return null;
        }
    }
}
