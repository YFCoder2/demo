package singleton;

/**
 * 枚举模式：最安全
 */

public class SingletonExample7 {

    // 私有构造函数
    private SingletonExample7() {

    }

    public static SingletonExample7 getInstance() {
        return  Singleton.INSTANCE.getSingletonExample7();
    }

    private enum Singleton  {
        INSTANCE;
        private  SingletonExample7 singletonExample7;

        Singleton(){
            singletonExample7 = new SingletonExample7();
        }
       public  SingletonExample7 getSingletonExample7(){
         return singletonExample7;
       }


    }

}






