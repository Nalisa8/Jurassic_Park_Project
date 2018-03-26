import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class Paddock_CarnTest {

    Paddock_Carn paddock_carn;


    @Before
    public void before() {
        paddock_carn = new Paddock_Carn("Fauna", 20);
        ArrayList<Dinosaur> testList = new ArrayList<>();

    }

    @Test
    public void hasName() {
        assertEquals("Fauna", paddock_carn.getName());
    }

    @Test
    public void hasCapacity() {
        assertEquals(20, paddock_carn.getCapacity());
    }

    @Test
    public void CapacityStartEmpty(){
        assertEquals(0,paddock_carn.DinosaurCount());
    }

//    @Test
//    public void CanAddDinosaur(){
//        list.add(dinosaur);}
    }


