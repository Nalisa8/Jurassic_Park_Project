import java.util.ArrayList;

public class PaddockCarn extends Paddock implements ITransfer{

    public PaddockCarn(String name, int capacity) {
        super(name, capacity);
    }


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
    @Override
    public int transfer() {
        return 0;
    }

}