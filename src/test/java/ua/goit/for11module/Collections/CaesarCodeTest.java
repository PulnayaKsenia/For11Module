package ua.goit.for11module.Collections;

import org.junit.Assert;
import org.junit.Test;

public class CaesarCodeTest {
    private final int offset = 3;

    @Test
    public void testEncrypt() throws Exception {
        final String original = "Little brown fox jumps over the lazy dog";
        final CaesarCode caesarCode = new CaesarCode();
        final String result = caesarCode.encrypt(original, offset);

        final String expect = "Olwwoh eurzq ira mxpsv ryhu wkh odcb grj";

        Assert.assertEquals(result, expect);
    }

    @Test
    public void testDecrypt() throws Exception {
        final String original = "Olwwoh eurzq ira mxpsv ryhu wkh odcb grj";
        final CaesarCode caesarCode = new CaesarCode();
        final String result = caesarCode.decrypt(original, offset);

        final String expect = "Little brown fox jumps over the lazy dog";

        Assert.assertEquals(result, original);
    }
}