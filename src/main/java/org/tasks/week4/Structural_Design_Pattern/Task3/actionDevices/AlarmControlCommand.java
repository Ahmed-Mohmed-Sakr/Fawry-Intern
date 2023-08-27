package org.tasks.week4.Structural_Design_Pattern.Task3.actionDevices;

public class AlarmControlCommand implements Command {
    final private Alarm alarm;

    public AlarmControlCommand(Alarm alarm) {
        this.alarm = alarm;
    }

    @Override
    public void execute() {
        alarm.turnOn();
    }

    @Override
    public void undo() {
        alarm.turnOff();
    }
}
