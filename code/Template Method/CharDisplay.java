/**
 * @author Yuukin
 * @data 2022/12/4 8:56
 */
public class CharDisplay  extends AbstractDisplay{

    private char ch;

    public CharDisplay(char ch) {
        this.ch = ch;
    }
    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(ch);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }
}
