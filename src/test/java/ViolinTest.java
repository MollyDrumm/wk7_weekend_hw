import instuments.Violin;
import org.junit.Before;
import org.junit.Test;

import java.lang.annotation.Target;

import static org.junit.Assert.assertEquals;

public class ViolinTest {

    Violin violin;

    @Before
    public void before(){
        violin = new Violin(4, "Electric");
    }

    @Test
    public void checkNumberOfStrings(){
        assertEquals(4, violin.getNumberOfStrings());
    }

    @Test
    public void checkTypeOfViolin(){
        assertEquals("Electric", violin.getTypeOfViolin());
    }

}
