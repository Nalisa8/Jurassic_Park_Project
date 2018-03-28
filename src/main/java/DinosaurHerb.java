import java.Food;

public class DinosaurHerb extends Dinosaur{

    public DinosaurHerb(String name, int heigth) {
        super(name, heigth);
    }

    public String getName() { return super.getName(); }

    public int getHeigth() {return super.getHeigth();}

    //    feed dinosaurs

    public int foodInTheBelly(){ return super.getStomach().size();}

    public void feed(Food food){ super.getStomach().add(food);
    }


}
