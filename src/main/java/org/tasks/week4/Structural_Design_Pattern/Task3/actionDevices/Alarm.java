package org.tasks.week4.Structural_Design_Pattern.Task3.actionDevices;

public class Alarm {
    private static Alarm instance;

    private Alarm() {
    }

    public static Alarm getInstance() {
        if (instance == null) {
            instance = new Alarm();
        }
        return instance;
    }

    protected void turnOn() {
        System.out.println("Alarm turned on");
    }

    protected void turnOff() {
        System.out.println("Alarm turned off");
    }
}
