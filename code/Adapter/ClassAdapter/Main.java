package ClassAdapter;

/**
 * @author Yuukin
 * @data 2022/12/3 9:13
 */
public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}

