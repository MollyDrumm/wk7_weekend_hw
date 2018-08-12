import behaviours.IPlay;
import instuments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;
    IPlay playNoise;

    @Before
    public void before(){
        guitar = new Guitar("White", "Electric", 6, 19, "Steel", playNoise);
    }

    @Test
    public void checkNumberOfStrings(){
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void checkNumberOfFrets(){
        assertEquals(19, guitar.getNumberOfFrets());
    }

    @Test
    public void checkTypeOfStrings(){
        assertEquals("Steel", guitar.getTypeOfStrings());
    }

    @Test
    public void checkPlay(){
        assertEquals("de de de", guitar.play());
    }
}
