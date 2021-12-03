package fr.exercice.western.characters;

public class Apache extends Human{

    private int feathers;
    private String totem;

    public Apache(String name) {
        super(name, "Root juice");
        this.feathers = 0;
        this.totem = "Coyote";
    }

    public void speaks(String text) {
        super.speaks(text + " Ugh!");
    }

    public void introduction() {
        super.introduction();
        speaks("I have " + this.feathers + " feathers because I scalped some Palefaces!");
    }

    public void scalps(Paleface paleface) {
        if (!paleface.getIsScalped()) {
            speaks("Ah! " + this.getName() + " has your scalp now, " + paleface.getName() + "!");
            paleface.speaks("Aouch, my head! That was not very nice, " + this.getName() + "!");
            paleface.setIsScalpedToTrue();
            this.feathers++;
        } else {
            speaks("What is this treachery, you have no scalp?");
            paleface.speaks("Man, I have no scalp anymore... You're goign to scoop out my brain " + this.getName() + "?");
        }
    }
}
