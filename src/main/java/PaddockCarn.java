import Dinosaurs.CarnSpecieList;
import Dinosaurs.Dinosaur;

import java.util.ArrayList;

public class PaddockCarn extends Paddock implements ITransfer {

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

    public void add(Dinosaur dinosaur) {
        if (canAddDinosaurToThisPaddock(dinosaur)) {
            super.getList().add(dinosaur);
        } else {
            System.out.println("Dinosaur not added, choose another paddock!");
        }
    }

    public void remove(Dinosaur dinosaur) {
        super.getList().remove(dinosaur);
    }


//    be able to transfer Herbivores between paddocks.

    @Override
    public void transfer() {
        ArrayList<Dinosaur> list = new ArrayList<>();
        for (Dinosaur dinosaur : super.getList()) {
            if (dinosaur.getType().equals("Herbivore")) {
                list.add(dinosaur);
            }
        }
        for (Dinosaur dinosaur : list) {
            super.getList().remove(dinosaur);
        }

    }
//    Dinosaurs marked as carnivores can only be placed with dinosaurs of the same type

      public boolean canAddDinosaurToThisPaddock(Dinosaur dinoTryingToAdd) {

        if (specieType.equals(dinoTryingToAdd.getType())) {
            System.out.println("This dinosaur goes in a different paddock for carnivores");
            return false;
        }
        //else if (specieType.equals(dinoTryingToAdd.getType())) {
            System.out.println("This dinosaur goes in the paddock of same specie");
            return true;
        //}
    }
}