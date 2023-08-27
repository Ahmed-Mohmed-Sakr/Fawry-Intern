package org.tasks.week4.Structural_Design_Pattern.Task3.myHome;


import org.tasks.week4.Structural_Design_Pattern.Task3.SMS.NewServiceSMSAdapter;


public class HomeOwner implements Observer {

    private String ownerName;
    private NewServiceSMSAdapter newServiceSMSAdapter;

    public HomeOwner(String ownerName) {
        this.ownerName = ownerName;
        this.newServiceSMSAdapter = new NewServiceSMSAdapter();
    }
    @Override
    public void update(String message) {
        newServiceSMSAdapter.sendSMS("SMS to homeowner " + ownerName + ": " + message);
    }
}
