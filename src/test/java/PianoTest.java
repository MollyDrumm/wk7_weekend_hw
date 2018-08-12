import instuments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano(88, 2);
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
