package org.tasks.week4.Structural_Design_Pattern.Task3.actionDevices;

public class SprinklerControlCommand implements Command {
    final private Sprinkler sprinkler;

    public SprinklerControlCommand(Sprinkler sprinkler) {
        this.sprinkler = sprinkler;
    }

    @Override
    public void execute() {
        sprinkler.turnOn();
    }

    @Override
    public void undo() {
        sprinkler.turnOff();
    }
}
