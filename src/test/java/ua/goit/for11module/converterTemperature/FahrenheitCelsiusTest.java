package ua.goit.for11module.converterTemperature;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FahrenheitCelsiusTest {
    @Test
    public void testCalculate() throws Exception {
        double fahrenheit = 95;

        final FahrenheitCelsius fC = new FahrenheitCelsius();
        fC.setFahrenheit(95);

        double result = fC.calculate();

        Assert.assertEquals(((fahrenheit - 32) * 5 / 9), result, 0);
    }
}