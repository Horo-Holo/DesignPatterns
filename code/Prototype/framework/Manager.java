package framework;

import java.util.HashMap;

/**
 * @author Yuukin
 * @data 2022/12/7 9:12
 */
public class Manager {
    private HashMap showcase =  new HashMap();
    public void register(String name, Product proto) {
        showcase.put(name, proto);
    }
    public Product create(String protoname) {
        Product p = (Product) showcase.get(protoname);
        return p.createClone();
    }
}
