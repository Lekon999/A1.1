package ru.netology.service;

import org.testng.annotations.Test;
public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    void remain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 500;
        int expected = 500;
        int actual = service.remain(amount);
        org.testng.Assert.assertEquals(actual, expected);
    }
    @org.testng.annotations.Test
    void remain2() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1;
        int expected = 999;
        int actual = service.remain(amount);
        org.testng.Assert.assertEquals(actual, expected);
    }
    @org.testng.annotations.Test
    void remain3() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int expected = 1;
        int actual = service.remain(amount);
        org.testng.Assert.assertEquals(actual, expected);
    }
    @org.testng.annotations.Test
    void remain4() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int expected = 999;
        int actual = service.remain(amount);
        org.testng.Assert.assertEquals(actual, expected);
    }
    @org.testng.annotations.Test
    void remain5() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1999;
        int expected = 1;
        int actual = service.remain(amount);
        org.testng.Assert.assertEquals(actual, expected);
    }
    @org.testng.annotations.Test
    void remain6() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1500;
        int expected = 500;
        int actual = service.remain(amount);
        org.testng.Assert.assertEquals(actual, expected);
    }
//    @org.testng.annotations.Test
//    void remain7() {
//        CashbackHackService service = new CashbackHackService();
//        int amount = 1000;
//        int expected = 1000;
//        int actual = service.remain(amount);
//        org.testng.Assert.assertEquals(actual, expected);
//    }
}