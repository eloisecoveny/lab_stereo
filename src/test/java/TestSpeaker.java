import components.CDPlayer;
import components.CassetteDeck;
import components.Radio;
import components.RecordDeck;
import org.junit.Before;
import org.junit.Test;
import output.Speaker;
import output.SpeakerType;
import stereo.Stereo;

import static org.junit.Assert.assertEquals;

public class TestSpeaker {

    public Speaker speakerLeft;
    public Speaker speakerRight;
    public RecordDeck turner;
    public CDPlayer cdPlayer;
    public Radio radio;
    public CassetteDeck cassetteDeck;
    public Stereo stereo;

    @Before
    public void setup(){
        speakerLeft = new Speaker("Sony", "MODEL", SpeakerType.LEFT);
        speakerRight = new Speaker("Sony", "MODEL", SpeakerType.RIGHT);

        turner = new RecordDeck("Sony", "MODEL");
        cdPlayer = new CDPlayer("Sony", "MODEL", 5);
        radio = new Radio("Sony", "MODEL");
        cassetteDeck = new CassetteDeck("Sony", "MODEL");

        stereo = new Stereo("Terminator", turner, cdPlayer, radio, cassetteDeck);
    }

    @Test
    public void bothSpeakersCanConnectToStereo(){
        assertEquals("LEFT speaker is now connected to Terminator", speakerLeft.connect(stereo));
        assertEquals("RIGHT speaker is now connected to Terminator", speakerRight.connect(stereo));
    }

}
