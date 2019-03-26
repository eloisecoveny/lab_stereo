import components.*;
import org.junit.Before;
import org.junit.Test;
import output.MiniDisc;
import stereo.Stereo;

import static org.junit.Assert.assertEquals;

public class TestMiniDisc {

    public MiniDisc miniDisc;
    public RecordDeck turner;
    public CDPlayer cdPlayer;
    public Radio radio;
    public CassetteDeck cassetteDeck;
    public Stereo stereo;

    @Before
    public void setup(){
        miniDisc = new MiniDisc("Sony", "MODEL");

        turner = new RecordDeck("Sony", "MODEL");
        cdPlayer = new CDPlayer("Sony", "MODEL", 5);
        radio = new Radio("Sony", "MODEL");
        cassetteDeck = new CassetteDeck("Sony", "MODEL");

        stereo = new Stereo("Terminator", turner, cdPlayer, radio, cassetteDeck);
    }

    @Test
    public void canConnectToStereo(){
        assertEquals("You are connected to Terminator", miniDisc.connect(stereo));
    }

}
