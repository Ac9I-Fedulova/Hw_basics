package ru.netology.service;


import org.junit.Assert;
//import org.junit.Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CashbackHackServiceTest {

    @Test
    public void shouldSayBuyMore() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(900);
        int expected = 100;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSayBuyMore(){
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldSayBuyAnother200(){
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(800);
        int expected = 200;

        Assertions.assertEquals(expected, actual);
    }


}
