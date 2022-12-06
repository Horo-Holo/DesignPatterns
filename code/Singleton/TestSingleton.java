package Simple;

import java.lang.reflect.Constructor;

/**
 * @author Yuukin
 * @data 2022/12/6 10:13
 */
public class TestSingleton {
    public static void main(String[] args) throws Exception {

        Singleton s1=Singleton.getInstance();
        Singleton s2=Singleton.getInstance();
        Constructor<Singleton> constructor=Singleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton s3=constructor.newInstance();
        System.out.println("实例一"+s1+"\n"+"实例二"+s2+"\n"+"实例三(反射)"+s3);
        System.out.println("正常情况下，实例化两个实例是否相同："+(s1==s2));
        System.out.println("通过反射攻击单例模式情况下，实例化两个实例是否相同："+(s1==s3));

    }
}
