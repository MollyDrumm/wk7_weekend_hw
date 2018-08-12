import behaviours.IPlay;
import behaviours.ISell;
import instuments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;
    IPlay playNoise;
    ISell sellItems;


    @Before
    public void before(){
        piano = new Piano("Brown", "Baby Grand", 88, 2, playNoise, 100, 150);
    }

    @Test
    public void checkNumberOfKeys(){
        assertEquals(88, piano.getNumberOfKeys());
    }

    @Test
    public void checkNumberOfPedals(){
        assertEquals(2, piano.getNumberOfPedals());
    }

    @Test
    public void checkBuyInPrice(){
        assertEquals(100, piano.getBuyInPrice());
    }

    @Test
    public void checkSellPrice(){
        assertEquals(150, piano.getSellPrice());
    }

    @Test
    public void checkCalculateMarkup(){
        double actual = piano.calculateMarkup(100, 150);
        assertEquals(50, actual, 0.1);
    }

}


