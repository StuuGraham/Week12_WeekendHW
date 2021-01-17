import instruments.InstrumentType;
import instruments.WoodwindInstrument;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WoodwindInstrumentTest {

    WoodwindInstrument woodwindInstrument;

    @Before
    public void setUp(){
        woodwindInstrument = new WoodwindInstrument("Oboe", "Silver", "Deedle Deeee",
                79.99, 109.99, InstrumentType.WOODWIND, "Metal");
    }

    @Test
    public void canCheckMaterialMadeOf(){
        assertEquals("Metal", woodwindInstrument.getMaterialMadeOf());
    }

    // Not testing for other properties as they have already been shown as successful in StringInstrumentTest.
}
