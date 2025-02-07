package org.vincent.game;

import java.util.Scanner;

public class GameMenu {
    public static void gameMenuInterface() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Word Guesser!");
        System.out.println("Choose the difficulty you want to play! (easy/hard)");
        String selectedDifficulty = scanner.nextLine();

        boolean isEasy = SelectDifficulty.isDifficultyEasy(selectedDifficulty);
        final int remainingAttempt = isEasy ? 10 : 20;

        //randomized easy words to be played. store the selected word in this class
        WordUtils.getRandomizedWord(isEasy);
        String playedWord = WordUtils.getRandomizedWord(isEasy);

        String clue = isEasy ?
                WordsCollection.EASY_WORDS.get(playedWord) :
                WordsCollection.HARD_WORDS.get(playedWord);

        //hide 2 words to become underline and system out the result here
        WordUtils.hideWords(playedWord,isEasy);
        System.out.println("Clue: "+clue + ". Remaining attempts: " + remainingAttempt);
        System.out.println(WordUtils.hideWords(playedWord,isEasy));
        //after shown to user
        //get the player 1st guess. compare using a method with inputs of stored selected words

        // and the guessed char.

        //update the hidden word with inputs of selected words, hidden words, guessed char

        //display the game result. win or lose and reveal the word
    }
}
