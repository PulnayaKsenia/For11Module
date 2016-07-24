package ua.goit.for11module.squareFigure;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    @Test
    public void testCalculate() throws Exception {
        double length = 7;
        double height = 6.9;

        Rectangle rectangle = new Rectangle();
        rectangle.setLength(7);
        rectangle.setHeightR(6.9);

        double result = rectangle.calculate();

        Assert.assertEquals(length*height, result, 0);
    }
}