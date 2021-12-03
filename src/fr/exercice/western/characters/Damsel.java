package fr.exercice.western.characters;

public class Damsel extends Paleface {

    private String dressColor;
    private boolean isCaptive;

    public Damsel(String name, String dressColor) {
        super(name, "Milk");
        this.dressColor = dressColor;
        this.isCaptive = false;
    }

    private void setDressColor(String newColor) {
        this.dressColor = newColor;
    }

    protected String getDressColor() {
        return this.dressColor;
    }

    public String getName() {
        return "Miss " + super.getName();
    }

    public void introduction() {
        super.introduction();
        speaks("My dress is of a beautiful " + this.getDressColor() + "!");
    }

    public void changeDressColor(String newColor) {
        this.setDressColor(newColor);
        this.speaks("Hey, look at my new " + newColor + " dress!");
    }

    public boolean getIsCaptive() {
        return this.isCaptive;
    }

    protected void toggleIsCaptive() {
        this.isCaptive = !this.isCaptive;
    }

    protected void screams(Outlaw outlaw) {
        this.speaks("Oh my god! I'm being kidnapped by " + outlaw.getName() + "!");
    }
}
