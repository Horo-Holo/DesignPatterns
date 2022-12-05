package idcard;

import framwork.Factory;
import framwork.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yuukin
 * @data 2022/12/5 9:37
 */
public class IDCardFactory extends Factory {

    private List owners = new ArrayList<>();
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }

    public List getOwners() {
        return owners;
    }
}
