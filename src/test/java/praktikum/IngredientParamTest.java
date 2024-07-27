package praktikum;

import constants.TestData;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class IngredientParamTest {

    @Parameterized.Parameter
    public IngredientType type;

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][]{
                {IngredientType.SAUCE},
                {IngredientType.FILLING},
        };
    }

    @Test
    public void getTypeTest() {
        IIngredient ingredient = new Ingredient(type, TestData.TEST_NAME, TestData.POSITIVE_PRICE);
        IIngredientType actual = ingredient.getType();
        assertEquals(type, actual);
    }
}
