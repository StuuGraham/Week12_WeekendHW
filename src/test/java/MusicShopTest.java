import instruments.InstrumentType;
import instruments.StringInstrument;
import music_shop.MusicShop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicShopTest {

    MusicShop musicShop;
    StringInstrument stringInstrument;

    @Before
    public void setUp(){
        musicShop = new MusicShop("No Strings Attached", 500.00);
        stringInstrument = new StringInstrument("Guitar", "Red", "Pliiing",
                99.99, 149.99, InstrumentType.STRING, 6);
    }

    @Test
    public void shopHasAName(){
        assertEquals("No Strings Attached", musicShop.getShopName());
    }

    @Test
    public void shopHasATill(){
        assertEquals(500.00, musicShop.getShopTill(),0);
    }

    @Test
    public void shopStockStartsEmpty(){
        assertEquals(0, musicShop.getShopStock().size());
    }

    @Test
    public void canAddInstrumentToStock(){
        musicShop.addToStock(stringInstrument);
        assertEquals(1, musicShop.getShopStock().size());
    }
}
