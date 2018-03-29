import Dinosaurs.CarnSpecieList;
import Dinosaurs.Dinosaur;
import Dinosaurs.DinosaurCarn;

import java.util.ArrayList;

public class PaddockCarn extends Paddock {

    private CarnSpecieList specieType;

    public PaddockCarn(String name, int capacity, CarnSpecieList specieType) {
        super(name, capacity);
        this.specieType = specieType;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getCapacity() {
        return super.getCapacity();
    }

    @Override
    public ArrayList<Dinosaur> getList() {
        return super.getList();
    }


    public CarnSpecieList getSpecie() {
        return this.specieType;
    }

//    add / remove dinosaurs to paddocks

    public void add(DinosaurCarn dinosaur) {
        if (canAddDinosaurToThisPaddock(dinosaur)) {
            super.getList().add(dinosaur);
        } else {
            System.out.println("Dinosaur not added, choose another paddock!");
        }
    }

    public void remove(Dinosaur dinosaur) {
        super.getList().remove(dinosaur);
    }



//    Dinosaurs marked as carnivores can only be placed with dinosaurs of the same type

      public boolean canAddDinosaurToThisPaddock(DinosaurCarn dinoTryingToAdd) {

        if (specieType.equals(dinoTryingToAdd.getSpecieType())) {
            System.out.println("This dinosaur goes in the paddock for same specie");
            return true;
        }
            System.out.println("This dinosaur goes in a different the paddock ");
            return false;
    }
}