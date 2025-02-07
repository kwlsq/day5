package org.vincent.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WordUtils {
    public static String getRandomizedWord(boolean isEasy){
        List<String> keys;
        if(isEasy){
            keys = new ArrayList<>(WordsCollection.EASY_WORDS.keySet());
        } else {
            keys = new ArrayList<>(WordsCollection.HARD_WORDS.keySet());
        }

        Random random = new Random();

        return keys.get(random.nextInt(keys.size()));
    }

    public static String hideWords(String words, boolean isEasy){
        int totalHiddenWords = isEasy ? 2 : words.length() - 5;

        Random random = new Random();

        String[] wordsArr = words.split("");

        for(int i=0;i<totalHiddenWords;i++){
            int randomIndex = random.nextInt(words.length());
            wordsArr[randomIndex] =  "_";
        }
        return String.join("",wordsArr);
    }

    private static boolean isGuessCorrect(String guess, String word){
        if(guess.length() != 1){
            throw new IllegalArgumentException("Input must be 1 character only");
        }
        return word.contains(guess);
    }

    public static String updateHiddenWords(String word, String hiddenWord, String guess){
        if(!isGuessCorrect(guess, word)) {
            return hiddenWord;
        }

        StringBuilder hiddenWordSb = new StringBuilder(hiddenWord);

        for(int i=0;i<word.length();i++){
            if(Character.toString(word.charAt(i)).equals(guess)){
                hiddenWordSb.replace(i,i+1,guess);
            }
        }

        return hiddenWordSb.toString();
    }
}
