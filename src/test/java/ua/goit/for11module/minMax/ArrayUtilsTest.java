package ua.goit.for11module.minMax;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ArrayUtilsTest {
    int[] arrayForTest = {2, -51, 13, 41, -1, 15, -25};

    @BeforeClass
    public static void testForArrayClass() throws Exception {
        System.out.println("testForArray method called!");
    }

    @Test(timeout = 1000)
    public void testGetMinMax() throws Exception {
        int min = -51;
        int max = 41;

        MinMaxPair minMax = ArrayUtils.getMinMax(arrayForTest);

        Assert.assertEquals(new MinMaxPair(min, max).toString(), minMax.toString());
    }

    @Test(timeout = 1000)
    public void testSort() throws Exception {
        int[] arrayAfterTest = {-51, -25, -1, 2, 13, 15, 41};
        int[] result = ArrayUtils.sort(arrayForTest);

        Assert.assertArrayEquals(arrayAfterTest, result);
    }
}