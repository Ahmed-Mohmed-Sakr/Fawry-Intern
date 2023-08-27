package org.tasks.week4.Structural_Design_Pattern.Task3.SMS;


public class NewServiceSMSAdapter implements SMSAdapter {

    final private OldServiceSMS oldServiceSMS;
    public NewServiceSMSAdapter(){
        oldServiceSMS = new OldServiceSMS();
    }
    @Override
    public void sendSMS(String message) {
        oldServiceSMS.sendSMSMessage(message);
    }
}
