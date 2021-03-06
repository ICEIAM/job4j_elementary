package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

@Test
    public void whenMax5To2Then5() {
        int left = 5;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To1Then1() {
        int left = 1;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 1;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To1to5Then1() {
        int left = 1;
        int right = 1;
        int middle = 5;
        int result = Max.max(left, right, middle);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To1to5to6Then1() {
        int left = 1;
        int right = 1;
        int middle = 5;
        int up = 6;
        int result = Max.max(left, right, middle, up);
        int expected = 6;
        Assert.assertEquals(result, expected);
    }
}