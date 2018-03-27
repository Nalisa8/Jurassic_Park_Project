import org.junit.Before;
import org.junit.Test;

import java.Food;

import static org.junit.Assert.assertEquals;

public class FoodTest {

    private Food food;

    @Before
public void before() {
    food = new Food("fish");
}

    @Test
    public void CanHaveName() {
        assertEquals("fish", food.getName());
    }

}




