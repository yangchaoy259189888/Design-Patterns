package gof.create.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StaticBlockSingletonTest {

    /**
     * 静态块初始化单例
     */
    @Test
    void getInstance() {
        System.out.println(StaticBlockSingleton.getInstance());
    }
}