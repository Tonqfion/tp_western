package fr.exercice.western.characters;

import java.util.ArrayList;

public interface Outlaw {

    void speaks(String text);

    boolean getIsImprisoned();

    void toggleIsImprisoned();

    void kidnaps(Damsel damsel);

    int getReward();

    String getRewardString();

    String getName();

    boolean hasCapturedDamsels();

    ArrayList<Damsel> getCapturedDamsels();
}
