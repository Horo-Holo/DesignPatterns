package Simple;

/**
 * @author Yuukin
 * @data 2022/12/6 10：12
 */

public enum SingletonEnum {
    INSTANCE;
    public SingletonEnum getInstance(){
        return INSTANCE;
    }
    
}