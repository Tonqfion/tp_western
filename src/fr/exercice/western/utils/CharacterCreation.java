package fr.exercice.western.utils;

import fr.exercice.western.characters.*;

import java.util.ArrayList;
import java.util.Scanner;

public class CharacterCreation {

    public static void createNewCharacter(Scanner scanner, ArrayList<Human> characters) {
        String newCharacterName = CharacterCreation.chooseName(scanner);
        System.out.println("Which character do you want to create?");
        System.out.println("1 - Apache");
        System.out.println("2 - Pale Face");
        int inputChoice = scanner.nextInt();

        if (inputChoice == 1) {
            characters.add(new Apache(newCharacterName));
        } else if (inputChoice == 2) {
            characters.add(CharacterCreation.createPaleface(scanner, newCharacterName));
        } else {
            System.out.println("Seems like you're quite dull. Let's try again.");
            CharacterCreation.createNewCharacter(scanner, characters);
        }
    }

    static String chooseName(Scanner scanner) {
        System.out.println("Enter the name of your new character");
        String characterName = scanner.next();
        if (characterName.length() == 0) {
            System.out.println("That's not correct, let's try again");
            chooseName(scanner);
        }
        return characterName;
    }

    static String chooseDressColor(Scanner scanner) {
        System.out.println("What would be the color of the dress?");
        return scanner.next();
    }

    static Paleface createPaleface(Scanner scanner, String newCharacterName) {
        System.out.println("What sort of pale face do you want to create?");
        System.out.println("1 - Cowboy");
        System.out.println("2 - Sheriff");
        System.out.println("3 - Bartender");
        System.out.println("4 - Damsel");
        System.out.println("5 - Bandit");
        System.out.println("6 - Damsel & Bandit");
        System.out.println("7 - Crooked");
        int paleFaceChoice = scanner.nextInt();
        switch(paleFaceChoice) {
            case 1:
                return new Cowboy(newCharacterName);
            case 2:
                return new Sheriff(newCharacterName);
            case 3:
                return new Bartender(newCharacterName);
            case 4:
                return new Damsel(newCharacterName, chooseDressColor(scanner));
            case 5:
                return new Bandit(newCharacterName);
            case 6:
                return new OutlawDamsel(newCharacterName, chooseDressColor(scanner));
            case 7:
                return new Crooked(newCharacterName);
            default:
                System.out.println("Pick a correct number please.");
                CharacterCreation.createPaleface(scanner, newCharacterName);
        }
        return null;
    }
}
