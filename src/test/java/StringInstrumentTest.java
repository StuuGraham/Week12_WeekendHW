import instruments.InstrumentType;
import instruments.StringInstrument;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringInstrumentTest {

    StringInstrument stringInstrument;

    @Before
    public void setUp() {
        stringInstrument = new StringInstrument("Guitar", "Red", "Pliiiiiing",
                189.99, 239.99, InstrumentType.STRING, 6);
    }

    @Test
    public void hasName() {
        assertEquals("Guitar", stringInstrument.getName());
    }

    @Test
    public void hasColour() {
        assertEquals("Red", stringInstrument.getColour());
    }

    @Test
    public void canChangeColour() {
        assertEquals("Red", stringInstrument.getColour());
        stringInstrument.changeColour("Purple");
        assertEquals("Purple", stringInstrument.getColour());
    }

    @Test
    public void canPlayInstrument() {
        assertEquals("Pliiiiiing", stringInstrument.playInstrument());
    }

    @Test
    public void canGetTradePrice() {
        assertEquals(189.99, stringInstrument.getTradePrice(), 0);
    }

    @Test
    public void canGetSalePrice() {
        assertEquals(239.99, stringInstrument.getSalePrice(), 0);
    }

    @Test
    public void canChangeSalePrice() {
    assertEquals(239.99, stringInstrument.getSalePrice(), 0);
    stringInstrument.setSalePrice(199.99);
    assertEquals(199.99, stringInstrument.getSalePrice(), 0);
    }

    @Test
    public void canGetInstrumentType(){
        assertEquals(InstrumentType.STRING, stringInstrument.getInstrumentType());
    }

    @Test
    public void canGetNumberOfStrings(){
        assertEquals(6, stringInstrument.getNumberOfStrings());
    }
}
