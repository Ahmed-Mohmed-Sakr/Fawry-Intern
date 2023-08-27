package org.tasks.week3.Creational_Design_Pattern.AbstractFactoryPattarn_Task.sofas;

import org.tasks.week3.Creational_Design_Pattern.AbstractFactoryPattarn_Task.Furniture;

public class SofaArt implements Furniture {

    @Override
    public void draw() {
        System.out.println("hello in the Sofa art");
    }
}
