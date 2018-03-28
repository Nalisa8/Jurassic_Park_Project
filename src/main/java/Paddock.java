import java.util.ArrayList;

public abstract class Paddock {
    private ArrayList<Dinosaur> beast;
    private String name;
    private  int capacity;

    public Paddock(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.beast = new ArrayList<>();

    }

    public String getName() {return this.name;}

    public int getCapacity() {return this.capacity;}

    public ArrayList<Dinosaur> getList() { return beast; }

    public int dinosaurCount(){return beast.size();}





}
