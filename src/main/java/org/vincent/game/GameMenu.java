package org.vincent.game;

import java.util.Scanner;

public class GameMenu {
    public static void gameMenuInterface(Scanner scanner) {
        System.out.println("Welcome to Word Guesser!");
        System.out.println("Choose the difficulty you want to play! (easy/hard)");
        String selectedDifficulty = scanner.nextLine();

        boolean isEasy = SelectDifficulty.isDifficultyEasy(selectedDifficulty);
        int remainingAttempt = isEasy ? 10 : 20;

        //randomized easy words to be played. store the selected word in this class
        WordUtils.getRandomizedWord(isEasy);
        String playedWords = WordUtils.getRandomizedWord(isEasy);

        String clue = isEasy ?
                WordsCollection.EASY_WORDS.get(playedWords) :
                WordsCollection.HARD_WORDS.get(playedWords);

        //hide words to become underline and system out the result here
        String playedHiddenWords = WordUtils.hideWords(playedWords, isEasy);

        System.out.println("Clue: " + clue + ". Remaining attempts: " + remainingAttempt);
        System.out.println(playedHiddenWords);

        //after shown to user
        //get the player guesses in loop. compare using a method with inputs of stored selected words
        do {
            String guess = scanner.next();

            playedHiddenWords = WordUtils.updateHiddenWords(playedWords, playedHiddenWords, guess);
            System.out.println(playedHiddenWords +
                    " | " + remainingAttempt + " remaining attempts.");

            remainingAttempt--;
        } while (!playedWords.equals(playedHiddenWords) && remainingAttempt != 0);

        if (remainingAttempt == 0) {
            System.out.println("You lose! The word is: " + playedWords);
        } else {
            System.out.println("Congratulations! you guessed the word '" +
                    playedWords + "' with " + remainingAttempt + " remaining attempts!");
        }
    }
}
