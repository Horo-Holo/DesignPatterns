package Simple;

/**
 * @author Yuukin
 * @data 2022/12/6 9:34
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Start");
        SingletonEager obj1 = SingletonEager.getInstance();
        SingletonEager obj2 = SingletonEager.getInstance();
        if (obj1 == obj2) {
            System.out.println("obj1 和 obj2 是相同的实例");
        } else {
            System.out.println("obj1 和 obj2 是不相同的实例");
        }
        System.out.println("End.");
    }
}
