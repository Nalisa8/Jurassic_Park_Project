import Dinosaurs.CarnSpecieList;
import Dinosaurs.DinosaurCarn;
import Dinosaurs.DinosaurHerb;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PaddockHerbTest {
    PaddockHerb paddock_herb;
    DinosaurHerb dinosaur1;
    DinosaurHerb dinosaur2;
    DinosaurHerb dinosaur3;

    DinosaurCarn dinosaur4;
    DinosaurCarn dinosaur5;
    DinosaurCarn dinosaur6;

    @Before
    public void before() {
        paddock_herb = new PaddockHerb("Flora", 30);

        dinosaur1 = new DinosaurHerb("Rohn", 5,"herbivore");
        dinosaur2 = new DinosaurHerb("Meggy", 3,"herbivore");
        dinosaur3 = new DinosaurHerb("Albert", 7,"herbivore");

        dinosaur5 = new DinosaurCarn("Bobby", 3, "carnivorous", CarnSpecieList.TYRANNOSAURUS);
        dinosaur4 = new DinosaurCarn("Graham", 7,"carnivorous",CarnSpecieList.TYRANNOSAURUS);
        dinosaur6 = new DinosaurCarn("Renato", 4,"carnivorous",CarnSpecieList.ALLOSAURUS);

    }



    @Test
    public void hasName() {
        assertEquals("Flora", paddock_herb.getName());
        System.out.println("You are in " + paddock_herb.getName() + " Paddock");
    }

    @Test
    public void hasCapacity() {
        assertEquals(30, paddock_herb.getCapacity());
        System.out.println("it can contain up to " + paddock_herb.getCapacity() + " Dinosaurs.");
    }

    @Test
    public void CapacityStartEmpty() {
        assertEquals(0, paddock_herb.dinosaurCount());
    }


    @Test
    public void dinosaurCount() {
        paddock_herb.add(dinosaur1);
        paddock_herb.add(dinosaur2);
        assertEquals(2, paddock_herb.dinosaurCount());
    }

    @Test
    public void CanRemoveDinosaurFromPaddockHerb() {
        paddock_herb.add(dinosaur1);
        paddock_herb.add(dinosaur2);
        paddock_herb.remove(dinosaur1);
        assertEquals(1,paddock_herb.dinosaurCount());
    }


    @Test
    public void canRemoveDinosaurHerbFromPaddockCarn(){

        paddock_herb.add(dinosaur2);
        paddock_herb.add(dinosaur4);
        paddock_herb.transfer();
        assertEquals(2,paddock_herb.getList().size());

    }

}
