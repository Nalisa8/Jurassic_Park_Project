import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DinosaurHerbTest {

    DinosaurHerb dinosaurHerb;

    @Before
    public void before(){
        dinosaurHerb = new DinosaurHerb("Shana", 6);
    }

    @Test
    public void hasName() {
        assertEquals("Bobby", dinosaurHerb.getName());
    }

    @Test
    public void HasHeigth(){
        assertEquals(6, dinosaurHerb.getHeigth());
    }

    @Test
    public void HasEmptyStomach(){
        assertEquals(0, dinosaurHerb.foodInTheBelly());
    }


}
