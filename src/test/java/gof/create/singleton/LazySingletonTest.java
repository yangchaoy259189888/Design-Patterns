package gof.create.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LazySingletonTest {

    /**
     *
     * 懒汉式单例模式测试
     */
    @Test
    void getInstance() {
        System.out.println(LazySingleton.getInstance());
    }
}