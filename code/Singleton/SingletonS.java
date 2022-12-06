package Simple;

/**
 * @author Yuukin
 * @data 2022/12/6 10:07
 * 静态内部类实现单例模式
 */
public class SingletonS {
    private SingletonS() {}
    private static class SingletonInstance {
        private static final SingletonS INSTANCE = new SingletonS();
    }

    public static SingletonS getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
