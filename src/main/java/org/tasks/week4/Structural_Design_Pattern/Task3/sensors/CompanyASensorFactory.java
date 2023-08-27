package org.tasks.week4.Structural_Design_Pattern.Task3.sensors;


public class CompanyASensorFactory implements SensorFactory {
    @Override
    public Sensor createSmokeSensor() {
        return new CompanyASmokeSensor();
    }

    @Override
    public Sensor createMotionSensor() {
        return new CompanyAMotionSensor();
    }
}
