package ua.goit.for11module.squareFigure;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {
    @Test
    public void testCalculate() throws Exception {
        double base = 5.5;
        double height = 6.4;

        final Triangle triangle = new Triangle();
        triangle.setBase(5.5);
        triangle.setHeight(6.4);

        double result = triangle.calculate();

        Assert.assertEquals(0.5*base*height, result, 0);
    }
}