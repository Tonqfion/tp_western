package fr.exercice.western.characters;

public abstract class Paleface extends Human {

    private boolean isScalped;
    public Paleface(String name, String favoriteDrink) {
        super(name, favoriteDrink);
        this.isScalped = false;
    }

    public boolean getIsScalped() {
        return this.isScalped;
    }

    protected void setIsScalpedToTrue() {
        this.isScalped = true;
    }
}
