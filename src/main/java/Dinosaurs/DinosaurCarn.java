package Dinosaurs;
import Dinosaurs.Food;

public class DinosaurCarn extends Dinosaur {



    public DinosaurCarn(String name, int heigth, String type) {
        super(name, heigth,type);
    }


    public String getName() { return super.getName(); }

    public int getHeigth() {return super.getHeigth();}

    public String getType(){ return super.getType();}

//    feed dinosaurs

    public int foodInTheBelly(){ return super.getStomach().size();}

    public void feed(Food food){ super.getStomach().add(food);}


}