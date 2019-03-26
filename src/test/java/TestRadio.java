import components.Radio;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestRadio {

    public Radio radio;

    @Before
    public void setup(){
        radio = new Radio("Sony", "MODEL");
    }

    @Test
    public void canTune(){
        assertEquals("Radio 1", radio.tune());
    }

    @Test
    public void hasMake(){
        assertEquals("Sony", radio.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("MODEL", radio.getModel());
    }
}
