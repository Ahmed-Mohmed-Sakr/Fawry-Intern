package org.tasks.week4.Structural_Design_Pattern.Task3.sensors;

import org.tasks.week4.Structural_Design_Pattern.Task3.actionDevices.Command;
import org.tasks.week4.Structural_Design_Pattern.Task3.actionDevices.Sprinkler;
import org.tasks.week4.Structural_Design_Pattern.Task3.actionDevices.SprinklerControlCommand;
import org.tasks.week4.Structural_Design_Pattern.Task3.logger.Logger;
import org.tasks.week4.Structural_Design_Pattern.Task3.myHome.HomeObserver;
import org.tasks.week4.Structural_Design_Pattern.Task3.myHome.HomeObserverControl;
import org.tasks.week4.Structural_Design_Pattern.Task3.myHome.HomeOwner;


public class CompanyBSmokeSensor implements Sensor {
    private final HomeObserverControl homeObserverControl;

    public CompanyBSmokeSensor(){
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
        System.out.println("Smoke detected");
        homeObserverControl.notifyObservers("Smoke detected");
        Logger.getInstance().log("Smoke detected");
        activateSprinkler();
    }

    private void activateSprinkler() {
        Sprinkler sprinkler = Sprinkler.getInstance();
        Command turnOnCommand = new SprinklerControlCommand(sprinkler);
        turnOnCommand.execute();
    }
}
