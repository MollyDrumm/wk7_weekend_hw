
import instuments.Violin;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class ViolinTest {

    Violin violin;



    @Before
    public void before(){
        violin = new Violin("black", "Electric", 4);
    }

    @Test
    public void checkNumberOfStrings(){
        assertEquals(4, violin.getNumberOfStrings());
    }

    @Test
    public void checkPlay(){
        assertEquals("La la la", violin.play());
    }

}
