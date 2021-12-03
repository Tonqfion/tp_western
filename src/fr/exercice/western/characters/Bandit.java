package fr.exercice.western.characters;

import java.util.ArrayList;

public class Bandit extends Paleface implements Outlaw {
    private final String style;
    private final ArrayList<Damsel> capturedDamsels;
    private int reward;
    private boolean isImprisoned;

    public Bandit(String name) {
        super(name, "Schnapps");
        this.style = "Bad Boy";
        this.reward = 100;
        this.isImprisoned = false;
        this.capturedDamsels = new ArrayList<>();
    }

    @Override
    public String getName() {
        return super.getName() + " the " + this.style;
    }

    @Override
    public void speaks(String text) {
        super.speaks(text);
    }

    public void introduction() {
        super.introduction();
        speaks("I look like a " + this.style + " and I've already kidnapped " + this.capturedDamsels.size() + " damsels.");
        speaks("The reward for my head is " + this.getRewardString() +"!");
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
            damsel.speaks("You idiot, I'm already captive.");
        } else {
            this.capturedDamsels.add(damsel);
            this.reward += 100;
            speaks("Ah! You are mine now, " + damsel.getName() + "! That's damsel number " + this.capturedDamsels.size() + "!");
            damsel.screams(this);
            damsel.toggleIsCaptive();
        }
    }

    @Override
    public int getReward() {
        return this.reward;
    }

    @Override
    public boolean hasCapturedDamsels() {
        return this.capturedDamsels.size() != 0;
    }

    @Override
    public ArrayList<Damsel> getCapturedDamsels() {
        return this.capturedDamsels;
    }
}
