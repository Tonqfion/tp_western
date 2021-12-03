package fr.exercice.western.utils;

import fr.exercice.western.characters.Damsel;
import fr.exercice.western.characters.Human;

import java.util.ArrayList;
import java.util.Scanner;

public class CharacterAction {

    public static void makeAction(Scanner scanner, ArrayList<Human> characters) {
            CharacterAction.pickCharacter(scanner, characters);
    }

    public static void pickCharacter(Scanner scanner, ArrayList<Human> characters) {
        System.out.println("Choose the character that makes the action:");
        int characterIndex = 0;
        for (Human character : characters) {
            System.out.println(characterIndex + 1 + " - " + character.getName());
            characterIndex++;
        }
        int characterIndexChosen = scanner.nextInt();
        if (characterIndexChosen < 0 || characterIndexChosen > characters.size()) {
            System.out.println("Not valid. Get a grip.");
            CharacterAction.pickCharacter(scanner, characters);
        } else {
            Human characterChosen = characters.get(characterIndexChosen - 1);
            chooseAction(scanner, characterChosen);
        }
    }

    public static void chooseAction(Scanner scanner, Human characterChosen) {
        if (characterChosen instanceof Damsel) {
            characterChosen.introduction();
        }
    }
}
