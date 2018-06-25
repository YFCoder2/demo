package ep1;

/**
 * Created by huangzhiwei on 2018/6/20.
 */

import java.util.concurrent.TimeUnit;

    public class BadSuspend {

        public static Object u = new Object();

        static ChangeObjectThread t1 = new ChangeObjectThread("t1");
        static ChangeObjectThread t2 = new ChangeObjectThread("t2");

        public static class ChangeObjectThread extends Thread{
            public ChangeObjectThread(String name) {
                super.setName(name);
            }

            @Override
            public void run() {
                synchronized (u){
                    System.out.println("in "+getName());
                    Thread.currentThread().suspend();
                }
            }
        }


        public static void main(String[] args) throws Exception{
            t1.start();
            t1.join();
            TimeUnit.MILLISECONDS.sleep(100);
            t2.start();
            t1.resume();
            t2.resume();
            t2.join();
        }


    }

