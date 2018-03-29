import Dinosaurs.Dinosaur;

import java.util.ArrayList;

public class PaddockHerb extends Paddock  {

    public PaddockHerb(String name, int capacity) {
        super(name, capacity);
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

//    add / remove dinosaurs to paddocks

    public void add(Dinosaur dinosaur) {
        super.getList().add(dinosaur);
        }

    public void remove(Dinosaur dinosaur){
        super.getList().remove(dinosaur);
    }
    //    be able to transfer Herbivores between paddocks\

//    public void transfer(ArrayList<Dinosaurs.Dinosaur> getList) {
//        if(Dinosaurs.DinosaurHerb : Paddock != Dinosaurs.DinosaurCarn : Paddock){
//        return Dinosaurs.DinosaurHerb : PaddockHerb;}
//    }


//
//    public void  transferDinosaurHerbInToPaddocks() {
//        if (transfer() = Dinosaurs.DinosaurHerb) {
//
//        }


}
