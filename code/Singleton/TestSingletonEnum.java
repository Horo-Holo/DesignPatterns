package Simple;

import java.lang.reflect.Constructor;

/**
 * @author Yuukin
 * @data 2022/12/6 10:26
 */
public class TestSingletonEnum {
    public static void main(String[] args) throws Exception {

        SingletonEnum singleton1=SingletonEnum.INSTANCE;
        SingletonEnum singleton2=SingletonEnum.INSTANCE;
        System.out.println("正常情况下，实例化两个实例是否相同："+(singleton1==singleton2));
        System.out.println("通过反射实例化实例...");
        Constructor<SingletonEnum> constructor= null;
        constructor = SingletonEnum.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        SingletonEnum singleton3= null;
        singleton3 = constructor.newInstance();
        System.out.println(singleton1+"\n"+singleton2+"\n"+singleton3);
        System.out.println("通过反射攻击单例模式情况下，实例化两个实例是否相同："+(singleton1==singleton3));

    }
}
