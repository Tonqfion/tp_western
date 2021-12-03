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

    private void setIsScalpedToTrue() {
        this.isScalped = true;
    }

    public void getsScalped(Apache apache) {
        if (!this.isScalped)  {
            speaks("Aouch, my head! That was not very nice, " + apache.getName() + "!");
            setIsScalpedToTrue();
        } else {
            speaks("Man, I have no scalp anymore... You're goign to scoop out my brain " + apache.getName() + "?");
        }
    }
}
