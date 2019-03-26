import components.CassetteDeck;
import components.CassetteType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCassetteDeck {

    public CassetteDeck tapePlayer;

    @Before
    public void setup(){
        tapePlayer = new CassetteDeck("Sony", "MODEL");
    }

    @Test
    public void hasMake(){
        assertEquals("Sony", tapePlayer.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("MODEL", tapePlayer.getModel());
    }

    @Test
    public void canSelectTape(){
        tapePlayer.selectTape(CassetteType.TAPE2);
        assertEquals("Radiohead fills the room", tapePlayer.play());
    }
}
