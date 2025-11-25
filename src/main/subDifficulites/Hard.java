package main.subDifficulites;

import java.util.*;
import main.Difficulty;

public class Hard extends Difficulty {
    private static final String[] WORDS_6 = {
        "CAMERA", "CASTLE", "CIRCLE", "COFFEE", "COTTON",
        "COUPLE", "CREDIT", "DANGER", "DOCTOR", "FAMILY",
        "FLOWER", "FRIDAY", "GARDEN", "HANDLE", "ISLAND", 
        "JUNGLE", "LADDER", "LETTER", "MARKET", "MOTHER", 
        "NUMBER", "ORANGE", "PALACE", "PLANET", "RABBIT", 
        "SUMMER", "TRAVEL", "UNIQUE", "VELVET", "WINDOW",
        "BOTTLE", "BRIDGE", "DONATE", "FORMAL", "GARDEN",
        "HUNTER", "KERNEL", "BANTER", "MISSED", "NATION",
        "OCEANS", "PENCIL", "QUIZES", "RIBUTS", "SUNSET",
        "TUNNEL", "UNLIKE", "VALLEY", "WINTER", "YELLOW",
        "BANANA", "BOTTLE", "BRIDGE", "BUCKET", "CANDLE",
        "DOUBTS", "FOREST", "HUNTER", "JACKET", "KERNEL"
    };

    public Hard() {
        this.attempts = 5;
        this.wordLength = 6;
    }

    @Override
    protected List<String> loadWords() {
        return Arrays.asList(WORDS_6);
    }
}