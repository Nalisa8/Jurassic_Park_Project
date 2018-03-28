import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

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
    public void HasName() {
        assertEquals("Kishan", visitor1.getName());
    }

    @Test
    public void HasAge(){
        assertEquals(24,visitor2.getAge());
    }

}
