package Simple;

/**
 * @author Yuukin
 * @data 2022/12/6 9:32
 * 饿汉式
 */
public class SingletonEager {
    private static final SingletonEager singleton = new SingletonEager();
    private SingletonEager() {
        System.out.println("生成了一个实例");
    }

    public static SingletonEager getInstance() {
        return singleton;
    }
}
