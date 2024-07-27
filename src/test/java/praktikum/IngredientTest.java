package praktikum;

import constants.TestData;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class IngredientTest {

    @Spy
    IIngredient ingredient = new Ingredient(IngredientType.SAUCE, TestData.TEST_NAME, TestData.POSITIVE_PRICE);

    @Test
    public void getPriceTest() {
        float exceptedPrice = TestData.POSITIVE_PRICE;
        float actualPrice = ingredient.getPrice();

        assertEquals(exceptedPrice, actualPrice, 0);
    }

    @Test
    public void getNameTest() {
        String exceptedName = TestData.TEST_NAME;
        String actualName = ingredient.getName();

        assertEquals(exceptedName, actualName);
    }

}
