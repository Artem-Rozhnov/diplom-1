import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;
import praktikum.Bun;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BunGetPriceParametrizedTest {
    private final String bunName;
    private final float bunPrice;
    public BunGetPriceParametrizedTest (String bunName, float bunPrice) {
        this.bunName = bunName;
        this.bunPrice = bunPrice;
    }
    @Parameterized.Parameters
    public static Object[][] testGet() {
        return new Object[][] {
                {"тест", 100f},
                {"тест", -100f},
                {"тест", 0f},
                {"тест", 0.001f},
                {"тест", 999f}
        };
    }
    @Test
    public void testGetPrice(){
        Bun bun = new Bun(bunName, bunPrice);
        assertEquals(bunPrice, bun.getPrice(), 0);
    }
}
