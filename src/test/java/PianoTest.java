import behaviours.IPlay;
import instuments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;
    IPlay playNoise;

    @Before
    public void before(){
        piano = new Piano("Brown", "Baby Grand", 88, 2, playNoise);
    }

    @Test
    public void checkNumberOfKeys(){
        assertEquals(88, piano.getNumberOfKeys());
    }

    @Test
    public void checkNumberOfPedals(){
        assertEquals(2, piano.getNumberOfPedals());
    }

}
