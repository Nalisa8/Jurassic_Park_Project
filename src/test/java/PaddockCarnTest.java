import Dinosaurs.CarnSpecieList;
import Dinosaurs.DinosaurCarn;
import Dinosaurs.DinosaurHerb;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PaddockCarnTest {

    PaddockCarn paddock_carn;
    DinosaurCarn dinosaur1;
    DinosaurCarn dinosaur2;
    DinosaurCarn dinosaur3;

    DinosaurHerb dinosaur4;
    DinosaurHerb dinosaur5;


    @Before
    public void before() {
        paddock_carn = new PaddockCarn("Fauna", 20,(CarnSpecieList.TYRANNOSAURUS));

        dinosaur1 = new DinosaurCarn("Bobby", 3, "carnivorous");
        dinosaur2 = new DinosaurCarn("Graham", 7,"carnivorous");
        dinosaur3 = new DinosaurCarn("Renato", 4,"carnivorous");

        dinosaur4 = new DinosaurHerb("Finn", 9,"herbivore");
        dinosaur5 = new DinosaurHerb("Kat", 6,"herbivore");

    }

    @Test
    public void canGetName() {
        assertEquals("Fauna", paddock_carn.getName());
        System.out.println("You are in " + paddock_carn.getName() + " Paddock");
    }

    @Test
    public void canGetCapacity() {
        assertEquals(20, paddock_carn.getCapacity());
        System.out.println("it can contain up to " + paddock_carn.getCapacity() + " Dinosaurs.");
    }


    @Test
    public void canGetSpecie(){
        assertEquals(CarnSpecieList.TYRANNOSAURUS, paddock_carn.getSpecie());
    }

    @Test
    public void capacityStartEmpty() {
        assertEquals(0, paddock_carn.dinosaurCount());
    }
    //    add / remove dinosaurs to paddocks
    @Test
    public void dinosaurCount() {
        paddock_carn.add(dinosaur1);
        assertEquals(1, paddock_carn.dinosaurCount());
    }

    @Test
    public void canRemoveDinosaurFromPaddockCarn() {
        paddock_carn.remove(dinosaur1);
        assertEquals(0,paddock_carn.dinosaurCount());
    }
    
    @Test
    public void canRemoveDinosaurHerbFromPaddockCarn(){

        paddock_carn.add(dinosaur2);
        paddock_carn.add(dinosaur4);
        paddock_carn.transfer();
        assertEquals(2,paddock_carn.getList().size());

    }

    @Test

    public  void cantAddDifferentCarnDinosaurToThisPaddock(){

    }
    
    
}



