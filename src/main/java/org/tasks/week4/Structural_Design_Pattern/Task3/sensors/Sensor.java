package org.tasks.week4.Structural_Design_Pattern.Task3.sensors;


import org.tasks.week4.Structural_Design_Pattern.Task3.myHome.HomeOwner;

public interface Sensor {
    public void detect();
    public void addOwner(HomeOwner homeOwner);
    public void removeOwner(HomeOwner homeOwner);
}
