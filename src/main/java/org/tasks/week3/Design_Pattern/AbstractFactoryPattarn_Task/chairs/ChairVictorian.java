package org.tasks.week3.Design_Pattern.AbstractFactoryPattarn_Task.chairs;

import org.tasks.week3.Design_Pattern.AbstractFactoryPattarn_Task.Furniture;

public class ChairVictorian implements Furniture {

    @Override
    public void draw() {
        System.out.println("hello in the Chair Victorian");
    }
}
