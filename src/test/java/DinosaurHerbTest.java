import org.junit.Before;
import org.junit.Test;

import java.Food;

import static org.junit.Assert.assertEquals;

public class DinosaurHerbTest {

    DinosaurHerb dinosaurHerb;
    Food food;

    @Before
    public void before(){
        dinosaurHerb = new DinosaurHerb("Shana", 6,"herbivore");
        food = new Food("fish");
    }

    @Test
    public void hasName() {
        assertEquals("Bobby", dinosaurHerb.getName());
    }

    @Test
    public void hasHeigth(){
        assertEquals(6, dinosaurHerb.getHeigth());
    }

    //    feed dinosaurs

    @Test
    public void hasEmptyStomach(){
        assertEquals(0, dinosaurHerb.foodInTheBelly());
    }
    @Test
    public void canFeedDinosaur(){
        dinosaurHerb.feed(food);
        assertEquals(1,dinosaurHerb.foodInTheBelly());
    }


}
