package main.subDifficulites;

import java.util.*;
import main.Difficulty;

public class Medium extends Difficulty {
    private static final String[] WORDS_5 = {
        "APPLE", "BRAVE", "CHESS", "DREAM", "EAGLE",
        "FIGHT", "GRAPE", "HOUSE", "INPUT", "JOKER",
        "KNIFE", "LIGHT", "MONEY", "NURSE", "OCEAN",
        "PARTY", "QUEEN", "RIVER", "SUGAR", "TRUST",
        "ADULT", "SHORT", "DAILY", "CASES", "THROW", 
        "MINUS", "CHASM", "SKATE", "STAKE", "STEAK", 
        "GLIDE", "FAKED", "PLAIN", "PLATE", "PLANE", 
        "INDIE", "INDIA","BRICK", "CRANE", "FAITH", 
        "GIANT", "HORSE", "INNER", "JOINT", "KNOCK", 
        "LAYER", "MOUND", "NOBLE", "OPERA", "PEACH", 
        "QUILT", "ROUND","STEAD", "TWIST", "UNDER", 
        "VITAL", "WATER", "SHIFT", "CLOCK", "BLINK"
    };

    public Medium() {
        this.attempts = 5;
        this.wordLength = 5;
    }

    @Override
    protected List<String> loadWords() {
        return Arrays.asList(WORDS_5);
    }
}