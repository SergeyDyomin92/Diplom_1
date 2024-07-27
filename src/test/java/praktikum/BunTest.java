package praktikum;

import constants.TestData;
import org.junit.Test;

import static org.junit.Assert.*;

public class BunTest {

    @Test
    public void getBunNameIsValidTest() {
        String expectedName = TestData.TEST_NAME;
        Bun bun = new Bun(expectedName, TestData.POSITIVE_PRICE);
        String actualName = bun.getName();

        assertEquals(expectedName, actualName);
    }

    @Test
    public void getBunNameIsNullTest() {
        Bun bun = new Bun(null, TestData.POSITIVE_PRICE);
        String actualName = bun.getName();

        assertNull(actualName);
    }

    @Test
    public void getBunNameIsEmptyTest() {
        Bun bun = new Bun("", TestData.POSITIVE_PRICE);
        String actualName = bun.getName();

        assertEquals("", actualName);
    }

    @Test
    public void getBunPriceIsValidTest() {
        float expectedPrice = TestData.POSITIVE_PRICE;
        Bun bun = new Bun(TestData.TEST_NAME, expectedPrice);
        float actualPrice = bun.getPrice();

        assertEquals(expectedPrice, actualPrice, 0);
    }

    @Test
    public void getBunPriceIsInvalidTest() {
        Bun bun = new Bun(TestData.TEST_NAME, TestData.NEGATIVE_PRICE);
        float actualPrice = bun.getPrice();

        assertTrue(actualPrice < 0);
    }
}
