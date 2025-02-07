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
}
