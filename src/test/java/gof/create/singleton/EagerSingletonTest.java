package gof.create.singleton;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
class EagerSingletonTest {

    /**
     *
     * 饿汉式单例模式测试
     */
    @Test
    void getInstance() {
        System.out.println(EagerSingleton.getInstance());
    }
}