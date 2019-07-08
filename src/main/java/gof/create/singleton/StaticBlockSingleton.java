package gof.create.singleton;

/**
 * @author 西邮陈冠希
 * @date 2019/7/8
 **/
public class StaticBlockSingleton {
    private static StaticBlockSingleton instance;

    private StaticBlockSingleton() {
    }

    static {
        instance = new StaticBlockSingleton();
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}
