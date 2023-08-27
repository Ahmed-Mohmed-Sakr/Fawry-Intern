package org.tasks.week3.Creational_Design_Pattern.eampleToThreadsOverlap;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello in main");

        HelloRunnable prog1 = new HelloRunnable(1);
        HelloRunnable prog2 = new HelloRunnable(2);

        Thread thread1 = new Thread(prog1);
        Thread thread2 = new Thread(prog2);
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        if (prog1.getDBMyInstance() != prog2.getDBMyInstance())
        {
            System.out.println("OW!!! they get different instance fom DB");
        }
        else {
            System.out.println("Great Same instance");
        }

        System.out.println("goodbye from main");
    }
}
