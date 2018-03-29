package Dinosaurs;

import java.util.ArrayList;

public abstract class  Dinosaur {
    private String name;
    private int heigth;
    private String type;
    public ArrayList<Food> stomach;


    public Dinosaur(String name, int heigth, String type){
    this.name = name;
    this.heigth = heigth;
    this.type = type;
    this.stomach = new ArrayList<>();

 }

    public String getName() {
        return name;
    }

    public int getHeigth() { return heigth; }

    public String getType(){ return type;}

    public ArrayList<Food> getStomach() {
        return stomach;
    }


}


