package org.tasks.week3.Design_Pattern.AbstractFactoryPattarn_Task.coffeeTables;

import org.tasks.week3.Design_Pattern.AbstractFactoryPattarn_Task.Furniture;

public class CoffeeTableArt implements Furniture {

    @Override
    public void draw() {
        System.out.println("hello in the Coffee_Table art");
    }
}
