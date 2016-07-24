package ua.goit.for11module.coordinates;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CoordinatesXYTest {

    @Test
    public void testCalculate() throws Exception {
        double x1 = -6.5;
        double x2 = 3;
        double y1 = 8.2;
        double y2 = -4.9;
        double x = (x2 - x1) * (x2 - x1);
        double y = (y2 - y1) * (y2 - y1);

        final CoordinatesXY coordinatesXY = new CoordinatesXY();
        coordinatesXY.setX1(-6.5);
        coordinatesXY.setX2(3);
        coordinatesXY.setY1(8.2);
        coordinatesXY.setY2(-4.9);

        double result = coordinatesXY.calculate();

        Assert.assertEquals(Math.sqrt(x + y), result, 0);
    }
}