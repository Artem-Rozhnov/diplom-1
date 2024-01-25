import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;
import praktikum.Bun;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BunGetNameParametrizedTest {
    private final String bunName;
    private final float bunPrice;
    public BunGetNameParametrizedTest (String bunName, float bunPrice) {
        this.bunName = bunName;
        this.bunPrice = bunPrice;
    }

    @Parameterized.Parameters
    public static Object[][] testGet() {
        return new Object[][] {
                {"black bun", 1},
                {"", 1},
                {"Очень очень преочень длинное длинное предлинное значение", 1},
                {"Bun#$5%", 1}
        };
    }
    @Test
    public void testGetName(){
        Bun bun = new Bun(bunName, bunPrice);
        assertEquals(bunName, bun.getName());
    }

}
