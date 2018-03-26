import java.util.ArrayList;

public abstract class Paddocks {
    private ArrayList<Dinosaur>list = new ArrayList<Dinosaur>();
    private String name;
    private  int Capacity;

    public Paddocks (String name, int Capacity){
        this.name = name;
        this.Capacity = Capacity;

    }

    public String getName() {return this.name;}

    public int getCapacity() {return this.Capacity;}

    public ArrayList<Dinosaur> getList() {
        return list;
    }
}
