import java.util.ArrayList;

public class PaddockHerb extends Paddock implements ITransfer {

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
//    be able to transfer Herbivores between paddocks.


    public int transfer() {
        return super.getList().add(1);
    }

}




    ;}

}