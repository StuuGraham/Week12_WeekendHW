import instruments.BrassInstrument;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BrassInstrumentTest {

    BrassInstrument brassInstrument;

    @Before
    public void setUp(){
        brassInstrument = new BrassInstrument("Trumpet", "Bronze", "Paaaaarp",
                129.99, 199.99, InstrumentType.BRASS, 3);
    }

    @Test
    public void canGetNumberOfValves(){
        assertEquals(3, brassInstrument.getNumberOfValves());
    }

    // Don't need to test for other properties as StringInstrument has already shown inheritance working.
}
