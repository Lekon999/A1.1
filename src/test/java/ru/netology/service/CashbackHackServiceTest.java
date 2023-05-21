package ru.netology.service;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void remain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 500;
        int expected = 500;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(actual, expected);
    }
    @org.junit.Test
    public void remain2() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1;
        int expected = 999;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(actual, expected);
    }
    @org.junit.Test
    public void remain3() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int expected = 1;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(actual, expected);
    }
    @org.junit.Test
    public void remain4() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int expected = 999;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(actual, expected);
    }
    @org.junit.Test
    public void remain5() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1999;
        int expected = 1;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(actual, expected);
    }
    @org.junit.Test
    public void remain6() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1500;
        int expected = 500;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(actual, expected);
    }


    @org.junit.Test
    public void remain7() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(actual, expected);
    }
}