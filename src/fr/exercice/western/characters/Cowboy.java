package fr.exercice.western.characters;

public class Cowboy extends Human implements Paleface {

    private int popularity;
    protected String qualifier;
    protected int banditsCaptured;

    public Cowboy(String name) {
        super(name, "Whiskey");
        this.popularity = 0;
        this.qualifier = "Valiant";
        this.banditsCaptured = 0;
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

    public void freesDamsel(Damsel damsel) {
        if (damsel.getIsCaptive()) {
            speaks("Hey, " + damsel.getName() + "! You look stunning in that" + damsel.getDressColor());
            damsel.getsFreed();
            this.popularity++;
        } else {
            speaks("I made a big mistake. " + damsel.getName() + " is not captive!");
        }
    }

    public void imprisons(Bandit bandit) {
        if (bandit.getIsImprisoned()) {
            speaks("In the name of the law, " + bandit.getName() + " you are under arrest.");
            bandit.getsImprisoned(this);
            this.banditsCaptured++;
        } else {
            speaks("Damnit, " + bandit.getName() + " is already in jail.");
        }
    }

    @Override
    public void getsScalped(Apache apache) {
        speaks(apache.getName() + " you dog! My hair were all I had!");
    }

}
