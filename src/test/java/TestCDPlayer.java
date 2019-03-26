import components.CDPlayer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCDPlayer {

    public CDPlayer cdPlayer;

    @Before
    public void setup(){
        cdPlayer = new CDPlayer("Sony", "MODEL", 5);
    }

    @Test
    public void canHoldFiveCDs(){
        assertEquals(5, cdPlayer.getCDCapacity());
    }

    @Test
    public void hasMake(){
        assertEquals("Sony", cdPlayer.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("MODEL", cdPlayer.getModel());
    }
}
