import java.Food;
import java.util.ArrayList;

public abstract class  Dinosaur {
    private String name;
    private int heigth;
    public ArrayList<Food> stomach;


    public Dinosaur(String name, int heigth){
    this.name = name;
    this.heigth = heigth;
    this.stomach = new ArrayList<>();

 }

    public String getName() {
        return name;
    }

    public int getHeigth() { return heigth; }

    public ArrayList<Food> getStomach() {
        return stomach;
    }


}


