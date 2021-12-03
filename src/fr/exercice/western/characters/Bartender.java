package fr.exercice.western.characters;

public class Bartender extends Paleface {

    private final String barName;

    public Bartender(String name) {
        super(name, "Wine");
        this.barName = name + "'s";
    }

    public Bartender(String name, String barName) {
        super(name, "Wine");
        this.barName = barName;
    }

    @Override
    public void introduction() {
        super.introduction();
        speaks("Welcome to " + barName + "!");
    }

    public void speaks(String text) {
        super.speaks(text + " Coco.");
    }

    public void serveDrinks(Human human) {
        speaks("Hey, " + human.getName() + "! Here is a glass of " + human.getFavoriteDrink() + " for you!");
        human.drink();
    }
}
