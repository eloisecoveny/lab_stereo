import components.*;
import org.junit.Before;
import org.junit.Test;
import stereo.Stereo;

import static org.junit.Assert.assertEquals;

public class TestStereo {

    public RecordDeck turner;
    public CDPlayer cdPlayer;
    public Radio radio;
    public CassetteDeck cassetteDeck;
    public Stereo stereo;

    @Before
    public void setup(){
        turner = new RecordDeck("Sony", "MODEL");
        cdPlayer = new CDPlayer("Sony", "MODEL", 5);
        radio = new Radio("Sony", "MODEL");
        cassetteDeck = new CassetteDeck("Sony", "MODEL");

        stereo = new Stereo("Terminator", turner, cdPlayer, radio, cassetteDeck);
    }

    @Test
    public void hasName(){
        assertEquals("Terminator", stereo.getName());
    }

    @Test
    public void hasTurner(){
        assertEquals(turner, stereo.getTurner());
    }

    @Test
    public void canChangeTurnerRecordSpeed(){
        stereo.getTurner().selectSpeed(RecordSpeed.SEVENTY_EIGHT);
        assertEquals(RecordSpeed.SEVENTY_EIGHT, stereo.getTurner().getSpeed());
    }

    @Test
    public void canPlayRecord(){
        assertEquals("The sound analogue hollow echoing record music", stereo.getTurner().play());
    }

    @Test
    public void hasCDPlayer(){
        assertEquals(cdPlayer, stereo.getCDPlayer());
    }

    @Test
    public void cdPlayerCanHold5Discs(){
        assertEquals(5, stereo.getCDPlayer().getCDCapacity());
    }

    @Test
    public void canPlayCD(){
        assertEquals("The sound of digital CD music", stereo.getCDPlayer().play());
    }

    @Test
    public void hasRadio(){
        assertEquals(radio, stereo.getRadio());
    }

    @Test
    public void canTuneRadio(){
        assertEquals("Radio 1", stereo.getRadio().tune());
    }

    @Test
    public void hasCassettePlayer(){
        assertEquals(cassetteDeck, stereo.getCassettePlayer());
    }

    @Test
    public void canPlayTape(){
        assertEquals("The sound of analogue tape music", stereo.getCassettePlayer().play());
    }

    @Test
    public void canRaiseVolume(){
        stereo.increaseVolume(5);
        assertEquals(25, stereo.getVolume());
    }

    @Test
    public void canLowerVolume(){
        stereo.decreaseVolume(5);
        assertEquals(15, stereo.getVolume());
    }
}
