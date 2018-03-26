import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Paddock_HerbTest {
    Paddock_Herb paddock_herb;

    @Before
    public void before() {
        paddock_herb = new Paddock_Herb("Flora", 30);
    }

//    @Test
//    public void hasName() {
//        assertEquals("Flora", paddock_herb.getName());
//    }

    @Test
    public void hasCapacity() {
        assertEquals(30, paddock_herb.getCapacity());
    }
}
