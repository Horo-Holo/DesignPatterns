package framework;

/**
 * @author Yuukin
 * @data 2022/12/7 9:08
 * 实现Cloneable接口
 */
public interface Product extends Cloneable{
    public abstract void use(String s);
    public abstract Product createClone();
}
