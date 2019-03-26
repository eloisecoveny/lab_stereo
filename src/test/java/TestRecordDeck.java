import components.RecordDeck;
import components.RecordSpeed;
import components.RecordType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestRecordDeck {

    public RecordDeck recordDeck;

    @Before
    public void setup(){
        recordDeck = new RecordDeck("Sony", "MODEL");
    }

    @Test
    public void speedStartsAtThirtyThree(){
        assertEquals(RecordSpeed.THIRTY_THREE, recordDeck.getSpeed());
    }

    @Test
    public void canSelectPlaySpeed(){
        recordDeck.selectSpeed(RecordSpeed.SEVENTY_EIGHT);
        assertEquals(RecordSpeed.SEVENTY_EIGHT, recordDeck.getSpeed());
    }

    @Test
    public void hasMake(){
        assertEquals("Sony", recordDeck.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("MODEL", recordDeck.getModel());
    }

    @Test
    public void canSelectRecord(){
        recordDeck.selectRecord(RecordType.RECORD1);
        assertEquals("Nina Simone fills the room", recordDeck.play());
    }
}
