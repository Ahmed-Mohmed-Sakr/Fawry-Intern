package org.tasks.week4.Structural_Design_Pattern.Task3;


import org.tasks.week4.Structural_Design_Pattern.Task3.actionDevices.*;
import org.tasks.week4.Structural_Design_Pattern.Task3.logger.Logger;
import org.tasks.week4.Structural_Design_Pattern.Task3.myHome.HomeOwner;
import org.tasks.week4.Structural_Design_Pattern.Task3.myHome.Observer;
import org.tasks.week4.Structural_Design_Pattern.Task3.sensors.CompanyASensorFactory;
import org.tasks.week4.Structural_Design_Pattern.Task3.sensors.CompanyBSensorFactory;
import org.tasks.week4.Structural_Design_Pattern.Task3.sensors.Sensor;
import org.tasks.week4.Structural_Design_Pattern.Task3.sensors.SensorFactory;


public class HSS_APP {
    public static void main(String[] args) {

        Command sprinklerControlCommand = new SprinklerControlCommand(Sprinkler.getInstance());
        Command alarmControlCommand = new AlarmControlCommand(Alarm.getInstance());

        SensorFactory companyASensorFactory = new CompanyASensorFactory();
        SensorFactory companyBSensorFactory = new CompanyBSensorFactory();


        HomeOwner homeowner1 = new HomeOwner("Ahmed");
        HomeOwner homeowner2 = new HomeOwner("Sakr");
        HomeOwner homeowner3 = new HomeOwner("Zainb");


        Sensor smokeSensor1 = companyASensorFactory.createSmokeSensor();
        Sensor smokeSensor2 = companyBSensorFactory.createSmokeSensor();
        Sensor motionSensor1 = companyASensorFactory.createMotionSensor();
        Sensor motionSensor2 = companyBSensorFactory.createMotionSensor();

        System.out.println("\n-----------------------------------------\n");
        smokeSensor1.addOwner(homeowner1);
        smokeSensor1.addOwner(homeowner3);
        smokeSensor1.detect();
        smokeSensor1.addOwner(homeowner2);
        smokeSensor1.detect();

        System.out.println("\n-----------------------------------------\n");
        smokeSensor2.addOwner(homeowner2);
        smokeSensor2.detect();

        System.out.println("\n-----------------------------------------\n");
        motionSensor1.addOwner(homeowner2);
        motionSensor1.addOwner(homeowner3);
        motionSensor1.detect();
        motionSensor1.removeOwner(homeowner2);
        motionSensor1.detect();

        System.out.println("\n-----------------------------------------\n");
        motionSensor2.addOwner(homeowner1);
        motionSensor2.detect();



        sprinklerControlCommand.undo();
        alarmControlCommand.undo();

        Logger.getInstance().close();
    }
}