package ep1;


import lombok.extern.slf4j.Slf4j;

/**
 * Created by huangzhiwei on 2018/6/14.
 */
@Slf4j
public class ThreadDemo1 {
    public static void main(String args[]){
        Thread t1 = new Thread(()->{System.out.println("t1 start");});

        Thread t2 = new Thread(()->{System.out.println("t2 start");});
        t1.start();
        t2.start();
    }

}
