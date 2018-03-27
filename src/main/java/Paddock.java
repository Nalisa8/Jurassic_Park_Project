import java.util.ArrayList;

public abstract class Paddock {
    private ArrayList<Dinosaur> list;
    private String name;
    private  int capacity;

    public Paddock(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.list = new ArrayList<>();

    }

    public String getName() {return this.name;}

    public int getCapacity() {return this.capacity;}

    public ArrayList<Dinosaur> getList() { return list; }

    public int dinosaurCount(){return list.size();}

//    public int add(Dinosaur) {
//        return 1;
//    }
//
//    public void remove(){list.remove(1);}



}
