package Dinosaurs;

public enum CarnSpecieList {

    TYRANNOSAURUS("Tyrannosaurus",5),
    TROODON("Troodon",3),
    ALLOSAURUS("Allosaurus",7),
    CARNOTAURUS("Carnotaurus",2),
    VELOCIRAPTOR("Velociraptor",9),
    SPINOSAURUS("Spinosaurus",4),
    MEGALOSAURUS("Megalosaurus",11);

    private final String specie;
    private final int quantity;

    CarnSpecieList(String specie, int quantity) {
        this.specie = specie;
        this.quantity = quantity;
    }


    public String getSpecie() {
        return specie;
    }

    public int getQuantity() {
        return quantity;
    }
    }


