import behaviours.IPlay;
import instuments.Harp;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HarpTest {

    Harp harp;
    IPlay playNoise;

    @Before
    public void before(){
        harp = new Harp("Black", "Concert Harp", 47);
    }

    @Test
    public void checkNumberOfStrings(){
        assertEquals(47, harp.getNumberOfStrings());
    }

}
