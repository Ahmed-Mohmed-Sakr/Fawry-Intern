package org.tasks.week3.Creational_Design_Pattern.eampleToThreadsOverlap;

public class HelloRunnable implements Runnable{
    private int id;
    private ConnectFackDB DB;
    HelloRunnable (int id){
        this.id =  id;
    }
    @Override
    public void run() {
        System.out.println("hello from thread number "+ id);
        DB = ConnectFackDB.getInstance();
    }

    public ConnectFackDB getDBMyInstance() {
        return DB;
    }
}
