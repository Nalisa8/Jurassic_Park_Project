import java.Food;

public class DinosaurCarn extends Dinosaur{


    public DinosaurCarn(String name, int heigth) {
        super(name, heigth);
    }


    public String getName() { return super.getName(); }

    public int getHeigth() {return super.getHeigth();}


    public int foodInTheBelly(){ return super.getStomach().size();}

    public void feed(Food food){ super.getStomach().add(food);
    }
}
