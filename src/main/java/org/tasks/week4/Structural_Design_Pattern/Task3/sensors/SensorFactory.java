package org.tasks.week4.Structural_Design_Pattern.Task3.sensors;


public interface SensorFactory {
    Sensor createSmokeSensor();

    Sensor createMotionSensor();
}
