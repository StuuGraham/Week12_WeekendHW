import instruments.InstrumentType;
import instruments.PercussionInstrument;
import instruments.PercussionType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PercussionInstrumentTest {

    PercussionInstrument percussionInstrument;

    @Before
    public void setUp(){
        percussionInstrument = new PercussionInstrument("Drumkit", "Black", "Ba-dum Tsss!",
                279.99, 349.99, InstrumentType.PERCUSSION, PercussionType.DRUMS);
    }

    @Test
    public void hasPercussionType(){
        assertEquals(PercussionType.DRUMS, percussionInstrument.getPercussionType());
    }

    @Test
    public void canGetProductMarkup(){
        assertEquals(70.00, percussionInstrument.productMarkup(), 0);
    }
    // Only testing PercussionType & Markup as StringInstrument has show all other tests work through Inheritance.
}
