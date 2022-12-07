import framework.Manager;
import framework.Product;

/**
 * @author Yuukin
 * @data 2022/12/7 9:24
 */
public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        UnderLinePen upen = new UnderLinePen('~');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');
        manager.register("Strong message", upen);
        manager.register("Warning box", mbox);
        manager.register("Slash box", sbox);

        Product p1 = manager.create("Strong message");
        p1.use("Hello World!");
        Product p2 = manager.create("Warning box");
        p2.use("Hello World!");
        Product p3 = manager.create("Slash box");
        p3.use("Hello World!");

    }
}
