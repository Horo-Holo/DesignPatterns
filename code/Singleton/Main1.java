package Simple;

/**
 * @author Yuukin
 * @data 2022/12/6 9:48
 */
public class Main1 {
    public static void main(String[] args) {
        System.out.println("Start");
        SingletonLazy lazy1 = SingletonLazy.getInstance();
        SingletonLazy lazy2 = SingletonLazy.getInstance();
        if(lazy1 == lazy2) {
            System.out.println("lazy1 和 lazy2是相同的实例");
        } else {
            System.out.println("lazy1 和 lazy2是不相同的实例");
        }
        System.out.println("End.");
    }
}
