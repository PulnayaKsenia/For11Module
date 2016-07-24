package ua.goit.for11module.squareFigure;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {
    @Test
    public void testCalculate() throws Exception {
        double radius = 8.2;

        final Circle circle = new Circle();
        circle.setRadius(8.2);

        double result = circle.calculate();

        Assert.assertEquals(Math.PI*radius*radius, result, 0);
    }
}