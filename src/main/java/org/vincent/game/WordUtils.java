package org.vincent.game;

import java.util.*;

public class WordUtils {
    public static String getRandomizedWord(boolean isEasy) {
        List<String> keys;
        if (isEasy) {
            keys = new ArrayList<>(WordsCollection.EASY_WORDS.keySet());
        } else {
            keys = new ArrayList<>(WordsCollection.HARD_WORDS.keySet());
        }

        Random random = new Random();

        return keys.get(random.nextInt(keys.size()));
    }

    public static String hideWords(String words) {
        int totalHiddenWords = (int) Math.floor(words.replace(" ", "").length() * 0.8);
        Random random = new Random();
        String[] wordsArr = words.split("");

        Set<Integer> hiddenIndexes = new HashSet<>();

        while (hiddenIndexes.size() < totalHiddenWords) {
            int randomIndex = random.nextInt(words.length());
            if (!wordsArr[randomIndex].equals(" ") && !hiddenIndexes.contains(randomIndex)) {
                wordsArr[randomIndex] = "_";
                hiddenIndexes.add(randomIndex);
            }
        }
        return String.join("", wordsArr);
    }

    private static boolean isGuessCorrect(String guess, String word) {
        if (guess.length() != 1) {
            throw new IllegalArgumentException("Input must be 1 character only");
        }
        return word.contains(guess);
    }

    public static String updateHiddenWords(String word, String hiddenWord, String guess) {
        if (!isGuessCorrect(guess, word)) {
            return hiddenWord;
        }

        StringBuilder hiddenWordSb = new StringBuilder(hiddenWord);

        for (int i = 0; i < word.length(); i++) {
            if (Character.toString(word.charAt(i)).equals(guess)) {
                hiddenWordSb.replace(i, i + 1, guess);
            }
        }

        return hiddenWordSb.toString();
    }
}
