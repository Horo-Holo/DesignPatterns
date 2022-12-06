package Simple;

/**
 * @author Yuukin
 * @data 2022/12/6 9:43
 * 懒汉式
 */
public class SingletonLazy {
    private static SingletonLazy singleton = null;
    private SingletonLazy() {
        System.out.println("生成了一个实例");
    }
    public static SingletonLazy getInstance() {
        synchronized (SingletonLazy.class) {
            if(singleton == null) {
                singleton = new SingletonLazy();
            }
        }
        return singleton;
    }
}
