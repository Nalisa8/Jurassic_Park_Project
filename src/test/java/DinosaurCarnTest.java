import org.junit.Before;
import org.junit.Test;

import java.Food;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DinosaurCarnTest {


    DinosaurCarn dinosaurCarn;

    @Before
    public void before(){
        dinosaurCarn = new DinosaurCarn("Bobby", 3);
    }
    @Test
    public void hasName() {
        assertEquals("Bobby", dinosaurCarn.getName());
    }

    @Test
    public void HasHeigth(){
        assertEquals(3, dinosaurCarn.getHeigth());
    }

    @Test
    public void HasEmptyStomach(){
        assertEquals(0, dinosaurCarn.foodInTheBelly());
    }

    @Test
    public void CanFeedDinosaur(){
        dinosaurCarn.feed(Food);
        assertEquals(1,dinosaurCarn.foodInTheBelly());
    }


}
