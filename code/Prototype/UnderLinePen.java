import framework.Product;

/**
 * @author Yuukin
 * @data 2022/12/7 9:22
 */
public class UnderLinePen implements Product {
    private char ulchar;

    public UnderLinePen(char ulchar) {
        this.ulchar = ulchar;
    }


    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        System.out.println("/" + s + "/");
        System.out.print(" ");
        for (int i = 0; i < length; i++) {
            System.out.print(ulchar);
        }
        System.out.println("");
    }

    @Override
    public Product createClone() {
        Product p = null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException exception) {
            exception.printStackTrace();
        }
        return p;
    }

}
