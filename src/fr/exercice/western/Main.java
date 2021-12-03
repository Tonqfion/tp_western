package fr.exercice.western;

import fr.exercice.western.characters.*;
import fr.exercice.western.utils.CharacterAction;
import fr.exercice.western.utils.CharacterCreation;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Human> characters = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! Welcome to this superb game. Let's create a new character!");
        CharacterCreation.createNewCharacter(scanner, characters);
        System.out.println("Only one character is not enough to make a good story, let's create another one");
        CharacterCreation.createNewCharacter(scanner, characters);
        chooseGeneralAction(scanner, characters);
    }



    public static void chooseGeneralAction(Scanner scanner, ArrayList<Human> characters) {
        System.out.println("What would you like to do now?");
        System.out.println("1 - Make someone do something");
        System.out.println("2 - Create a new character");
        System.out.println("3 - Stop the game");
        int inputChoice = scanner.nextInt();
        if (inputChoice == 1) {
            CharacterAction.makeAction(scanner, characters);
            chooseGeneralAction(scanner, characters);
        } else if (inputChoice == 2) {
            CharacterCreation.createNewCharacter(scanner, characters);
            chooseGeneralAction(scanner, characters);
        } else {
            System.out.println("Thank for playing, and see you around!");
            System.exit(0);
        }
    }
}
