package fr.exercice.western.characters;

import java.util.ArrayList;

public class Cowboy extends Paleface {

    private int popularity;
    protected String qualifier;
    protected int outlawsCaptured;

    public Cowboy(String name) {
        super(name, "Whiskey");
        this.popularity = 0;
        this.qualifier = "Valiant";
        this.outlawsCaptured = 0;
    }


    public void introduction() {
        super.introduction();
        speaks("Everyone says I'm " + this.qualifier + ".");
        speaks(popularitySpeech());
    }

    private String popularitySpeech() {
        if (this.popularity == 0) {
            return "I'm not yet famous, but my time will come.";
        } else if (this.popularity <= 3) {
            return "I'm making a name for myself. Step. By. Step";
        } else {
            return "Don't you know me? I'm quite famous though.";
        }
    }


    public void shoots(Outlaw outlaw) {
        System.out.println("The " + this.qualifier + " " + this.getName() + " shoots " + outlaw.getName() + ". Bang!");
        speaks("Take that, rascal!");
    }

    private void freeUniqueDamsel(Damsel damsel) {
        if (damsel.getIsCaptive()) {
            speaks("Hey, " + damsel.getName() + "! You look stunning in that " + damsel.getDressColor() + " dress!");
            damsel.speaks("Thank you so much!");
            damsel.toggleIsCaptive();
            this.popularity++;
        } else {
            speaks("I made a big mistake. " + damsel.getName() + " is not captive!");
            damsel.speaks("You moron, I'm not captive ... yet!");
        }
    }

    private void freeAllDamsels(ArrayList<Damsel> damsels) {
        for (Damsel damsel : damsels) {
            this.freeUniqueDamsel(damsel);
        }
    }

    public void imprisons(Outlaw outlaw) {
        if (!outlaw.getIsImprisoned()) {
            speaks("In the name of the law, " + outlaw.getName() + " you are under arrest.");
            outlaw.speaks("Oh no, you damned " + this.getName() + "! You got me!");
            outlaw.toggleIsImprisoned();
            this.outlawsCaptured++;
            if (outlaw.hasCapturedDamsels()) {
                this.freeAllDamsels(outlaw.getCapturedDamsels());
            }
        } else {
            speaks("Damnit, " + outlaw.getName() + " is already in jail.");
            speaks("Pretty sure I'm already in jail.");
        }
    }
}
