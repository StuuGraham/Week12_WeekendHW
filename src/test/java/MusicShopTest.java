import accessories.Accessory;
import accessories.AccessoryType;
import instruments.InstrumentType;
import instruments.PercussionInstrument;
import instruments.PercussionType;
import instruments.StringInstrument;
import music_shop.MusicShop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicShopTest {

    MusicShop musicShop;
    StringInstrument stringInstrument;
    PercussionInstrument percussionInstrument;
    Accessory accessory;
    Accessory accessory2;

    @Before
    public void setUp(){
        musicShop = new MusicShop("No Strings Attached", 500.00);
        stringInstrument = new StringInstrument("Guitar", "Red", "Pliiing",
                99.99, 149.99, InstrumentType.STRING, 6);
        percussionInstrument = new PercussionInstrument("Drumkit", "Black", "Ba-dum Tss!",
                159.99, 299.99, InstrumentType.PERCUSSION, PercussionType.DRUMS);
        accessory = new Accessory("Super SLinky", AccessoryType.STRINGS);
        accessory2 = new Accessory("Vic Firth", AccessoryType.DRUMSTICKS);
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

    @Test
    public void canCalculateTotalPotentialProfit(){
        musicShop.addToStock(stringInstrument);
        musicShop.addToStock(percussionInstrument);
        musicShop.addToStock(accessory);
        musicShop.addToStock(accessory2);
        assertEquals(219.00, musicShop.getTotalPotentialProfit(), 0);
    }

    @Test
    public void canSellAProduct(){
        musicShop.sellProduct(stringInstrument);
        assertEquals(649.99, musicShop.getShopTill(), 0);
    }
}
