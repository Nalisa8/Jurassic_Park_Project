import java.util.ArrayList;

public abstract class  Dinosaur {
private String name;
    private ArrayList<String>stomach= new ArrayList<String>();


public Dinosaur(String name){
    this.name = name;

 }

 public String getName(){
    return name;
 }


    public ArrayList<String> getStomach() {
        return stomach;
    }
}
