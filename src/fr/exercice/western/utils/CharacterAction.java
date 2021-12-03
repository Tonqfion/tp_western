package fr.exercice.western.utils;

import fr.exercice.western.characters.*;

import java.util.ArrayList;
import java.util.Objects;
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
            showActions(scanner, characterChosen);
        }
    }

    public static void showActions(Scanner scanner, Human characterChosen) {
        StringBuilder actionOptions = new StringBuilder("What would you like to do?\nIntroduce yourself - type 'intro'\nDrink a glass of your favorite drink - type 'drink'\n");

        if (characterChosen instanceof Paleface) {
            if (characterChosen instanceof Damsel) {
                actionOptions.append("Change your dress color - type 'change'\n");
                if (characterChosen instanceof OutlawDamsel) {
                    actionOptions.append("Kidnap a Damsel - type 'kidnap'\n");
                }
            }
            if (characterChosen instanceof Bandit) {
                actionOptions.append("Kidnap a Damsel - type 'kidnap'\n");
            }
            if (characterChosen instanceof Cowboy) {
                actionOptions.append("Shoot a bandit - type 'shoot'\n");
                actionOptions.append("Imprison a bandit (and free the damsels!) - type 'imprison'\n");
                if (characterChosen instanceof Sheriff) {
                    actionOptions.append("Advertise a wanted bandit - type 'search'\n");
                }
                if (characterChosen instanceof Crooked) {
                    actionOptions.append("Kidnap a Damsel - type 'kidnap'\n");
                }
            }
            if (characterChosen instanceof Bartender) {
                actionOptions.append("Serve a drink to someone - type 'serve'\n");
            }
        } else if (characterChosen instanceof Apache) {
            actionOptions.append("Scalp someone - type 'scalp'\n");
        }
        System.out.println(actionOptions);
        chooseAction(scanner, characterChosen);
    }

    private static void chooseAction(Scanner scanner, Human characterChosen) {
        String actionChosen = scanner.next();
        if (Objects.equals(actionChosen, "intro")) {
            characterChosen.introduction();
        } else if (Objects.equals(actionChosen, "drink")) {
            characterChosen.drink();
        } else if (Objects.equals(actionChosen, "change")) {
            System.out.println("What color do you want your new dress to be?");
            ((Damsel) characterChosen).changeDressColor(scanner.next());
        } else if (
                Objects.equals(actionChosen, "kidnap") ||
                Objects.equals(actionChosen, "shoot") ||
                Objects.equals(actionChosen, "imprison") ||
                Objects.equals(actionChosen, "search")) {
            System.out.println("Select the character you want to " + actionChosen + ".");
        }

    }

    private static Human selectRecipient(Scanner scanner) {

    }
}
