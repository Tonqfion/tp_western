package fr.exercice.western.characters;

public interface Outlaw {

    void speaks(String text);

    boolean getIsImprisoned();

    void getsImprisoned(Cowboy cowboy);

    void toggleIsImprisoned();

    void kidnaps(Damsel damsel);

    int getReward();

    String getRewardString();

    String getName();
}
