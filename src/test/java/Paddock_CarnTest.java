import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Paddock_CarnTest {

    Paddock_Carn paddock_carn;

    @Before
    public void before() {
        paddock_carn = new Paddock_Carn("Fauna", 20);
    }

//    @Test
//    public void hasName() {
//        assertEquals("Flora", paddock_carn.getName());
//    }

    @Test
    public void hasCapacity() {
        assertEquals(20, paddock_carn.getCapacity());
    }
}


