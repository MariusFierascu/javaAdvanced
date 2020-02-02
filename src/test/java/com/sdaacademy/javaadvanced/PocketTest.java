package com.sdaacademy.javaadvanced;

import org.junit.Test;

public class PocketTest {

    @Test
    public void testMoney() {
        Pocket pocket = new Pocket(0);
        assert pocket.getMoney(0) == 0;

        pocket.setMoney(15);
        assert pocket.getMoney(12) == 12;
        assert pocket.getMoney(9) == 9;

        pocket.setMoney(0);
        assert pocket.getMoney(9) == 0;

        pocket.setMoney(4000);
        assert pocket.getMoney(9) == 0;

    }
}