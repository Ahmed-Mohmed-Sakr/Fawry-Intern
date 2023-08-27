package org.tasks.week4.Structural_Design_Pattern.Task3.sensors;

import org.tasks.week4.Structural_Design_Pattern.Task3.actionDevices.Alarm;
import org.tasks.week4.Structural_Design_Pattern.Task3.actionDevices.AlarmControlCommand;
import org.tasks.week4.Structural_Design_Pattern.Task3.actionDevices.Command;
import org.tasks.week4.Structural_Design_Pattern.Task3.logger.Logger;
import org.tasks.week4.Structural_Design_Pattern.Task3.myHome.HomeObserver;
import org.tasks.week4.Structural_Design_Pattern.Task3.myHome.HomeObserverControl;
import org.tasks.week4.Structural_Design_Pattern.Task3.myHome.HomeOwner;

public class CompanyBMotionSensor implements Sensor {
    private final HomeObserverControl homeObserverControl;

    public CompanyBMotionSensor(){
        homeObserverControl = new HomeObserverControl();
    }

    @Override
    public void addOwner(HomeOwner homeOwner) {
        this.homeObserverControl.attach(homeOwner);
    }

    @Override
    public void removeOwner(HomeOwner homeOwner) {
        this.homeObserverControl.detach(homeOwner);
    }

    @Override
    public void detect() {
        System.out.println("Motion detected");
        homeObserverControl.notifyObservers("Motion detected");
        Logger.getInstance().log("Motion detected");
        activateAlarm();
    }

    private void activateAlarm() {
        Alarm alarm = Alarm.getInstance();
        Command turnOnCommand = new AlarmControlCommand(alarm);
        turnOnCommand.execute();
    }
}
