package fr.exercice.western.characters;

public abstract class Human {
    private final String NAME;
    private final String FAVORITE_DRINK;

    public Human(String name, String favoriteDrink) {
        this.NAME = name;
        this.FAVORITE_DRINK = favoriteDrink;
    }

    protected void speaks(String text) {
        System.out.println(this.NAME + " - " + text);
    }

    public void introduction() {
        this.speaks("Hello, my name is " + this.NAME + " and my favorite drink is " + this.FAVORITE_DRINK + ".");
    }

    public void drink() {
        this.speaks("Eh, a good glass of " + this.FAVORITE_DRINK + "! GLOUPS!");
    }

    public String getName() {
        return this.NAME;
    }

    @Override
    public String toString() {
        return this.NAME;
    }

    public String getFavoriteDrink() {
        return this.FAVORITE_DRINK;
    }
}
