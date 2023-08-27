package org.tasks.week4.Structural_Design_Pattern.Task3.sensors;


public class CompanyBSensorFactory implements SensorFactory {
    @Override
    public Sensor createSmokeSensor() {
        return new CompanyBSmokeSensor();
    }

    @Override
    public Sensor createMotionSensor() {
        return new CompanyBMotionSensor();
    }
}
