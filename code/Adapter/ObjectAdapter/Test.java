package ObjectAdapter;

/**
 * @author Yuukin
 * @data 2022/12/3 9:30
 */
public class Test {
    public static void main(String[] args) {
        Print p = new PrintBanner("string");
        p.printWeak();
        p.printStrong();
    }
}
