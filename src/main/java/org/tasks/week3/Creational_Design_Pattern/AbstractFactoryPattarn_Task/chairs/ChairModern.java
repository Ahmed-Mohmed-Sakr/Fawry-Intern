package org.tasks.week3.Creational_Design_Pattern.AbstractFactoryPattarn_Task.chairs;

import org.tasks.week3.Creational_Design_Pattern.AbstractFactoryPattarn_Task.Furniture;

public class ChairModern implements Furniture {

    @Override
    public void draw() {
        System.out.println("hello in the Chair Modern");
    }
}
