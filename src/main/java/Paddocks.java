import java.util.ArrayList;

public abstract class Paddocks {
    private ArrayList<Dinosaur>list = new ArrayList<>();
    private String name;
    private  int capacity;

    public Paddocks (String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.list = new ArrayList<>();

    }

    public String getName() {return this.name;}

    public int getCapacity() {return this.capacity;}

    public ArrayList<Dinosaur> getList() { return list; }

    public int DinosaurCount(){return list.size();}

    public void add(Dinosaur dinosaur){list.add(dinosaur);}

    public void remove(Dinosaur dinosaur){list.remove(dinosaur);}




}
