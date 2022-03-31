package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when33to37then4() {
        Point a = new Point(3, 3);
        Point b = new Point(3, 7);
        double expected = 4;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to010then10() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 10);
        double expected = 10;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when34to36then2() {
        Point a = new Point(3, 4);
        Point b = new Point(3, 6);
        double expected = 2;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double expected = 2;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);

    }
}
