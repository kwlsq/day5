package org.vincent.game;

public class SelectDifficulty {
    public static boolean isDifficultyEasy(String selectedDifficulty){
        if(
                !selectedDifficulty.equalsIgnoreCase("easy") &&
                !selectedDifficulty.equalsIgnoreCase("hard")
        ){
            throw new IllegalArgumentException("Please choose between easy/hard");
        }

        return selectedDifficulty.equalsIgnoreCase("easy");
    }
}
