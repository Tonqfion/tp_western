package fr.exercice.western.characters;

public class Crooked extends Cowboy implements Outlaw {

    private int damselsCaptured;
    private int reward;
    private boolean isImprisoned;

    public Crooked(String name) {
        super(name);
        this.damselsCaptured = 0;
        this.reward = 100;
        this.isImprisoned = false;
    }

    @Override
    public boolean getIsImprisoned() {
        return this.isImprisoned;
    }

    @Override
    public void toggleIsImprisoned() {
        this.isImprisoned = !this.isImprisoned;
    }

    @Override
    public String getRewardString() {
        return this.getReward() + "$";
    }

    @Override
    public void kidnaps(Damsel damsel) {
        if (damsel.getIsCaptive()) {
            this.speaks("I made a big mistake. " + damsel.getName() + " is already captive!");
        } else {
            this.damselsCaptured++;
            this.reward += 100;
            speaks("Ah! You are mine now, " + damsel.getName() + "! That's damsel number " + damselsCaptured + "!");
            damsel.getsKidnapped(this);
        }
    }

    @Override
    public int getReward() {
        return this.reward;
    }

    @Override
    public void getsImprisoned(Cowboy cowboy) {
        if (this.getIsImprisoned()) {
            speaks("Oh no, you damned " + cowboy.getName() + "! You got me!");
            toggleIsImprisoned();
        } else {
            speaks("Pretty sure I'm already in jail.");
        }
    }
}

