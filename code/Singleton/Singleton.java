package Simple;

/**
 * @author Yuukin
 * @data 2022/12/6 9:56
 * 双重检验锁
 */
public class Singleton {
    private volatile static Singleton singleton;
    private Singleton() {
    }

    public static Singleton getInstance() {
        //先判断类对象是否已经实例过，没有实例化过才进入加锁代码
        if(singleton == null) {
            synchronized (Singleton.class) {
                if(singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
