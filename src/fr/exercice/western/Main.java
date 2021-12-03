package fr.exercice.western;

import fr.exercice.western.characters.*;

public class Main {

    public static void main(String[] args) {

        Bandit jack = new Bandit("Jack");
        Damsel lucy = new Damsel("Lucy","Red");
        Cowboy luke = new Cowboy("Luke");
        Cowboy clint = new Sheriff("Clint");
        Bartender pedro = new Bartender("Pedro");
        Crooked julian = new Crooked("Julian");
        OutlawDamsel mary = new OutlawDamsel("Mary", "Blue");

        jack.introduction();
        lucy.introduction();
        luke.introduction();
        luke.shoots(jack);
        pedro.introduction();
        pedro.serveDrinks(luke);
        clint.introduction();
        julian.introduction();
        mary.introduction();
        mary.kidnaps(lucy);
        jack.kidnaps(lucy);
    }
}
