package org.tasks.week3.Creational_Design_Pattern.AbstractFactoryPattarn_Task;

import org.tasks.week3.Creational_Design_Pattern.AbstractFactoryPattarn_Task.FurnitureFactory.FurnitureArtFactory;
import org.tasks.week3.Creational_Design_Pattern.AbstractFactoryPattarn_Task.FurnitureFactory.FurnitureModernFactory;
import org.tasks.week3.Creational_Design_Pattern.AbstractFactoryPattarn_Task.FurnitureFactory.FurnitureVictorianFactory;

public class Main {
    public static void main(String[] args) {
        FurnitureArtFactory furnitureArtFactory  = new FurnitureArtFactory();
        FurnitureVictorianFactory furnitureVictorianFactory  = new FurnitureVictorianFactory();
        FurnitureModernFactory furnitureModernFactory = new FurnitureModernFactory();

        furnitureArtFactory.CreateFurniture(FurnitureTypes.Chair).draw();
        furnitureArtFactory.CreateFurniture(FurnitureTypes.Sofa).draw();
        furnitureArtFactory.CreateFurniture(FurnitureTypes.coffeeTable).draw();

        furnitureModernFactory.CreateFurniture(FurnitureTypes.Chair).draw();
        furnitureModernFactory.CreateFurniture(FurnitureTypes.Sofa).draw();
        furnitureModernFactory.CreateFurniture(FurnitureTypes.coffeeTable).draw();

        furnitureVictorianFactory.CreateFurniture(FurnitureTypes.Chair).draw();
        furnitureVictorianFactory.CreateFurniture(FurnitureTypes.Sofa).draw();
        furnitureVictorianFactory.CreateFurniture(FurnitureTypes.coffeeTable).draw();
    }
}
