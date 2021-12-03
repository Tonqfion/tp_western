package fr.exercice.western.characters;

public class Bandit extends Paleface implements Outlaw {
    private final String style;
    private int damselsCaptured;
    private int reward;
    private boolean isImprisoned;

    public Bandit(String name) {
        super(name, "Schnapps");
        this.style = "Bad Boy";
        this.damselsCaptured = 0;
        this.reward = 100;
        this.isImprisoned = false;
    }

    public String getName() {
        return super.getName() + " the " + this.style;
    }

    @Override
    public void speaks(String text) {
        super.speaks(text);
    }

    public boolean getIsImprisoned() {
        return this.isImprisoned;
    }

    public void toggleIsImprisoned() {
        this.isImprisoned = !this.isImprisoned;
    }

    @Override
    public String getRewardString() {
        return this.getReward() + "$";
    }

    public void introduction() {
        super.introduction();
        speaks("I look like a " + this.style + " and I've already kidnapped " + this.damselsCaptured + " damsels.");
        speaks("The reward for my head is " + this.getRewardString() +"!");
    }


    @Override
    public void kidnaps(Damsel damsel) {
        if (damsel.getIsCaptive()) {
            this.speaks("I made a big mistake. " + damsel.getName() + " is already captive!");
            damsel.speaks("You idiot, I'm already captive.");
        } else {
            this.damselsCaptured++;
            this.reward += 100;
            speaks("Ah! You are mine now, " + damsel.getName() + "! That's damsel number " + damselsCaptured + "!");
            damsel.screams(this);
            damsel.toggleIsCaptive();
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
