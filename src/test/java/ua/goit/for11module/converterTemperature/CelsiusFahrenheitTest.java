package ua.goit.for11module.converterTemperature;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CelsiusFahrenheitTest {
    @Test
    public void testCalculate() throws Exception {
        double celsius = 28.2;

        final CelsiusFahrenheit cF = new CelsiusFahrenheit();
        cF.setCelsius(28.2);

        double output = ((celsius * 9) / 5) + 32;

        double result = cF.calculate();

        Assert.assertEquals(output, result, 0);
    }
}