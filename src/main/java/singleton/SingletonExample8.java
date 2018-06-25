package singleton;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by huangzhiwei on 2018/6/22.
 */
@Slf4j
public class SingletonExample8 {
    // 静态内部类
    private static class NestClass {
        private static SingletonExample8 instance;

        static {
            System.out.println("instance = new SingletonTest()");
            instance = new SingletonExample8();
        }
    }

    //构造方法私有化  防止外部调用
    private SingletonExample8() {
        System.out.println("private SingletonTest()");
    }

    public static SingletonExample8 getInstance() {
        log.info("----- getInstance -----");
        return NestClass.instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Thread t1 = new Thread(() -> {
                log.info("instance {}", SingletonExample8.getInstance());
            });
            t1.start();
        }

    }
}
