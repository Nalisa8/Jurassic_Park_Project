package Dinosaurs;
import Dinosaurs.Food;

public class DinosaurCarn extends Dinosaur {

    private CarnSpecieList specieType;

    public DinosaurCarn(String name, int heigth, String type,CarnSpecieList specieType) {
        super(name, heigth,type);

        this.specieType = specieType;
    }


    public String getName() { return super.getName(); }

    public int getHeigth() {return super.getHeigth();}

    public String getType(){ return super.getType();}

    public CarnSpecieList getSpecieType(){ return this.specieType;}

//    feed dinosaurs

    public int foodInTheBelly(){ return super.getStomach().size();}

    public void feed(Food food){ super.getStomach().add(food);}


}
