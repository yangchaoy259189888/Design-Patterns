package gof.create.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LazySingletonTest {

    @Test
    void getInstance() {
        System.out.println(LazySingleton.getInstance());
    }
}