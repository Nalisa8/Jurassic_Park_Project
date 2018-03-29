import Dinosaurs.CarnSpecieList;
import Dinosaurs.DinosaurCarn;
import Dinosaurs.Food;
import org.junit.Before;
import org.junit.Test;

//import Dinosaurs.Food;

import static org.junit.Assert.assertEquals;

public class DinosaurCarnTest {
    DinosaurCarn dinosaurCarn;
    Food food;

    @Before
    public void before(){
        dinosaurCarn = new DinosaurCarn("Bobby", 3,"carnivorous", CarnSpecieList.TYRANNOSAURUS);
        food = new Food("fish");
    }
    @Test
    public void hasName() {
        assertEquals("Bobby", dinosaurCarn.getName());
    }

    @Test
    public void hasHeigth(){
        assertEquals(3, dinosaurCarn.getHeigth());
    }

    @Test
    public void hasType(){
        assertEquals("carnivorous", dinosaurCarn.getType());
    }


    //    feed dinosaurs

    @Test
    public void hasEmptyStomach(){
        assertEquals(0, dinosaurCarn.foodInTheBelly());
    }

    @Test
    public void canFeedDinosaur(){
        dinosaurCarn.feed(food);
        assertEquals(1,dinosaurCarn.foodInTheBelly());
    }

}
