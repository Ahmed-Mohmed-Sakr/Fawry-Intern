package org.tasks.week3.Design_Pattern.AbstractFactoryPattarn_Task.FurnitureFactory;

import org.tasks.week3.Design_Pattern.AbstractFactoryPattarn_Task.Furniture;
import org.tasks.week3.Design_Pattern.AbstractFactoryPattarn_Task.FurnitureTypes;

public abstract class FurnitureAbstractFactory {
    abstract  public  Furniture CreateFurniture(FurnitureTypes types);
}
