package ObjectAdapter;

import ClassAdapter.Banner;
import ObjectAdapter.Print;

/**
 * @author Yuukin
 * @data 2022/12/3 9:27
 */
public class PrintBanner extends Print {
    private Banner banner;

    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
