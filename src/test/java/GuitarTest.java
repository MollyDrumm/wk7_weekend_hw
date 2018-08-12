import instuments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar(6, 19, "Steel");
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

}
