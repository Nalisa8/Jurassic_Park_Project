import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;
    Visitor visitor4;
    Visitor visitor5;
    Visitor visitor6;
    Visitor visitor7;
    Visitor visitor8;

    @Before
    public void before(){
        park = new Park("Jurassic Park", 10);
        visitor1 = new Visitor("Kishan", 40);
        visitor2 = new Visitor("Miguel", 24);
        visitor3 = new Visitor("David", 18);
        visitor4 = new Visitor("Graham", 50);
        visitor5 = new Visitor("Bert", 32);
        visitor6 = new Visitor("Amy", 29);
        visitor7 = new Visitor("Jane", 60);
        visitor8 = new Visitor("Paul", 10);
    }

    @Test
    public void hasName(){
        assertEquals("Jurassic Park",park.getName());
        System.out.println("Welcome to " + park.getName());
    }

    @Test
    public void hasQuantity(){
        assertEquals(10, park.getQuantityVisitor());
    }

    @Test
    public void haslist(){
        assertEquals(0, park.getList().size());
    }

    @Test
    public void quantityStartEmpty() {
        assertEquals(0, park.visitorCount());
    }

    // Enter Visitors

    @Test
    public void visitorCanEnter(){
        park.add(visitor1);
        park.add(visitor2);
        park.add(visitor3);
        assertEquals(3,park.visitorCount());
    }

    // Exit Visitors

    @Test
    public void visitorCanExit(){
        park.add(visitor1);
        park.add(visitor2);
        park.add(visitor3);
        park.remove(visitor1);
        park.remove(visitor2);
        assertEquals(1,park.visitorCount());

    }


}
