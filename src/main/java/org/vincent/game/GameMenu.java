package org.vincent.game;

import java.util.Scanner;

public class GameMenu {
    public static void gameMenuInterface(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Word Guesser!");
        System.out.println("Choose the difficulty you want to play! (easy/hard)");
        String selectedDifficulty = scanner.nextLine();

        if(SelectDifficulty.isDifficultyEasy(selectedDifficulty)){
            //set max attempts to 10
            final int maxAttempts = 10;

            //randomized easy words to be played. store the selected word in this class
            //hide 2 words to become underline and system out the result here

            //after shown to user
            //get the player 1st guess. compare using a method with inputs of stored selected words
            // and the guessed char.

            //update the hidden word with inputs of selected words, hidden words, guessed char

            //display the game result. win or lose and reveal the word
        } else {
            //set max attempts to 20
            final int maxAttempts = 20;

        }
    }
}
