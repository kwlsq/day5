package org.vincent.game;

import java.util.HashMap;
import java.util.Map;

public class WordsCollection {
    public static final Map<String, String> EASY_WORDS = new HashMap<>();
    public static final Map<String, String> HARD_WORDS = new HashMap<>();

    static {
        EASY_WORDS.put("cat", "meow");
        EASY_WORDS.put("dog", "barks");
        EASY_WORDS.put("sun", "shines");
        EASY_WORDS.put("fish", "swims");
        EASY_WORDS.put("bird", "flies");

        HARD_WORDS.put("hello world", "Common first program output");
        HARD_WORDS.put("black hole", "A region of space with strong gravity");
        HARD_WORDS.put("time travel", "Moving through time like in sci-fi");
        HARD_WORDS.put("quantum physics", "Study of very tiny particles");
        HARD_WORDS.put("artificial intelligence", "Machines that think like humans");
    }
}
