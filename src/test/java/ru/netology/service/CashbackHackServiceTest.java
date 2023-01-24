package ru.netology.service;

import static org.junit.Assert.*;

//import org.testng.annotations.Test;


public class CashbackHackServiceTest {

    @org.junit.Test
    public void shouldReturn100IfAmountIs900() {
        // подготовка
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        // выполнение целевого действия
        int actual = service.remain(amount);
        int expected = 100;
        // сравнение ожидаемого и фактического
        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void shouldReturn100IfAmountIs1900() {
        // подготовка
        CashbackHackService service = new CashbackHackService();
        int amount = 1900;
        // выполнение целевого действия
        int actual = service.remain(amount);
        int expected = 100;
        // сравнение ожидаемого и фактического
        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void shouldReturnZeroIfAmountIs1000() {
        // подготовка
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        // выполнение целевого действия
        int actual = service.remain(amount);
        int expected = 0;
        // сравнение ожидаемого и фактического
        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void shouldReturnZeroIfAmountIs2000() {
        // подготовка
        CashbackHackService service = new CashbackHackService();
        int amount = 2000;
        // выполнение целевого действия
        int actual = service.remain(amount);
        int expected = 0;
        // сравнение ожидаемого и фактического
        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void shouldReturn1000IfAmountIsZero() {
        // подготовка
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        // выполнение целевого действия
        int actual = service.remain(amount);
        int expected = 1000;
        // сравнение ожидаемого и фактического
        assertEquals(actual, expected);
    }

    @org.junit.Test(expected = Exception.class)
    public void shouldThrowExceptionIfAmountIsNegative() {
        // подготовка
        CashbackHackService service = new CashbackHackService();
        int amount = -1500;
        // выполнение целевого действия
        int actual = service.remain(amount);
    }
}