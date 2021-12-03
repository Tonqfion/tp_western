package fr.exercice.western.characters;

import java.util.ArrayList;

public class OutlawDamsel extends Damsel implements Outlaw{

    private final ArrayList<Damsel> capturedDamsels;
    private int reward;
    private boolean isImprisoned;

    public OutlawDamsel(String name, String dressColor) {
        super(name, dressColor);
        this.capturedDamsels = new ArrayList<>();
        this.reward = 100;
        this.isImprisoned = false;
    }

    @Override
    public void speaks(String text) {
        super.speaks(text);
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
