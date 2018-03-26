import java.util.ArrayList;

public class Paddock_Carn extends Paddocks {

    public Paddock_Carn(String name, int capacity) {
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
}