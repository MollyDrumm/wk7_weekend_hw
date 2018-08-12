import instuments.Harp;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HarpTest {

    Harp harp;

    @Before
    public void before(){
        harp = new Harp(47);
    }

    @Test
    public void checkNumberOfStrings(){
        assertEquals(47, harp.getNumberOfStrings());
    }



}
