package ep1;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by huangzhiwei on 2018/6/20.
 */
@Slf4j

public class DaemonDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            while (true){
              log.info("----- t1 run------");
            }
        });

        t1.setDaemon(true);

        t1.start();

    }

}
