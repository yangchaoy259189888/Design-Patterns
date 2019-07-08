package gof.create.singleton;

/**
 * @author 西邮陈冠希
 * @date 2019/7/8
 **/
public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();

    public static EagerSingleton getInstance() {
        return instance;
    }
}
