import accessories.Accessory;
import accessories.AccessoryType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccessoryTest {

    Accessory accessory;

    @Before
    public void setUp(){
        accessory = new Accessory("Super Slinky", AccessoryType.STRINGS);
    }

    @Test
    public void canGetAccessoryName(){
        assertEquals("Super Slinky", accessory.getName());
    }

    @Test
    public void canGetAccessoryType(){
        assertEquals(AccessoryType.STRINGS, accessory.getAccessoryType());
    }

    @Test
    public void canGetAccessoryTradePrice(){
        assertEquals(9.99, accessory.getTradePrice(), 0);
    }

    @Test
    public void canGetAccessorySalePrice(){
        assertEquals(29.99, accessory.getSalePrice(), 0);
    }
}
