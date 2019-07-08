package gof.create.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BillPughSingletonTest {

    @Test
    void getInstance() {
        System.out.println(BillPughSingleton.getInstance());
    }
}