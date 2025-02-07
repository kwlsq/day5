package org.vincent.game;

import java.util.Scanner;

public class GameMenu {
    public static void gameMenuInterface() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Word Guesser!");
        System.out.println("Choose the difficulty you want to play! (easy/hard)");
        String selectedDifficulty = scanner.nextLine();

        boolean isEasy = SelectDifficulty.isDifficultyEasy(selectedDifficulty);
        final int maxAttempts = isEasy ? 10 : 20;

        //randomized easy words to be played. store the selected word in this class
        WordUtils.getRandomizedWord(true);
        String playedWord = WordUtils.getRandomizedWord(true);
        String clue = WordsCollection.EASY_WORDS.get(playedWord);
//        System.out.println(playedWord);
//        System.out.println(clue);

        //hide 2 words to become underline and system out the result here

        //after shown to user
        //get the player 1st guess. compare using a method with inputs of stored selected words
        // and the guessed char.

        //update the hidden word with inputs of selected words, hidden words, guessed char

        //display the game result. win or lose and reveal the word
    }
}
