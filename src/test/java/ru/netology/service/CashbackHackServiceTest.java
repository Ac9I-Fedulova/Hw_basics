package ru.netology.service;

//import junit.framework.TestCase;
// extends TestCase

import org.junit.Assert;
import org.junit.Test;

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
}
