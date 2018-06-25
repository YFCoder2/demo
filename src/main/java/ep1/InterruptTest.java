package ep1;

/**
 * Created by huangzhiwei on 2018/6/20.
 */
public class InterruptTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{while (true){

            if (Thread.currentThread().isInterrupted()){
                System.out.println("----run isInterrupted ----");
            }
            if (Thread.currentThread().isInterrupted()){
                System.out.println("----run isInterrupted2 ----");
            }else {
                System.out.println("--- t1 runing----");
            }

        }});
        t1.start();
        t1.interrupt();
    }

}
