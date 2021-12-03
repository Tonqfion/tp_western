package fr.exercice.western.characters;

public class Sheriff extends Cowboy {

    public Sheriff(String name) {
        super(name);
        this.qualifier = "Honest";
    }

    public String getName() {
        return "Sheriff " + super.getName();
    }

    public void introduction() {
        super.introduction();
        speaks("I have put " + this.outlawsCaptured + " bandit(s) in jail.");
    }

    public void wanted(Outlaw outlaw) {
        speaks("Hear! Hear! " + outlaw.getRewardString() + " to whoever catches " + outlaw.getName() + " dead or alive!");
    }
}
