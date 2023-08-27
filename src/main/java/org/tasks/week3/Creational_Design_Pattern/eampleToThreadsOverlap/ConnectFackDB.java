package org.tasks.week3.Creational_Design_Pattern.eampleToThreadsOverlap;

public class ConnectFackDB {

    private static ConnectFackDB DB;

    private ConnectFackDB(){

    }

    public static ConnectFackDB getInstance () {

//        // problem there  of ove head
//        if (DB == null) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            DB = new ConnectFackDB();
//        }

        // solution
        if (DB == null) {

            /// solution
            synchronized (ConnectFackDB.class) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if (DB == null) {
                    DB = new ConnectFackDB();
                }
            };
        }

        return DB;
    }


}
