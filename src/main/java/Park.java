import java.util.ArrayList;

public class Park {

    private String name;
    private int quantityVisitor;
    public ArrayList<Visitor> list;


    public Park(String name, int quantityVisitor){
        this.name = name;
        this.quantityVisitor = quantityVisitor;
        this.list = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public int getQuantityVisitor(){
        return quantityVisitor;
    }

    public ArrayList<Visitor> getList() {
        return list;
    }

    public int visitorCount() { return list.size();
    }

    // Enter/Exit Visitors

    public void add(Visitor visitor){
        list.add(visitor);
    }

    public void remove(Visitor visitor) {
        list.remove(visitor);
    }


}
