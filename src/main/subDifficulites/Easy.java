package main.subDifficulites;

import java.util.*;
import main.Difficulty;

public class Easy extends Difficulty {
    private static final String[] WORDS_4 = {
        "DUMB", "TINT", "EXIT", "MOON", "GIRL", "HERE",
        "TOSS", "WENT", "MICE", "HAIR", "EVEN", "REED",
        "CONE", "DOOR", "NINE", "KATE", "BASE", "SONG",
        "WIND", "FIRE", "COLD", "WARM", "BLUE", "PINK",
        "MASK", "HILL", "TREE", "FORK", "HAND", "FOOD",
        "GAME", "LION", "WOLF", "BIRD", "DEEP", "KING",
        "BACK", "CALM", "FIRM", "ECHO", "GLOW", "HOLD",
        "JUMP", "KIND", "LAKE", "MILD", "NEAT", "ODEA",
        "WARD", "MILD", "ROAD", "GAIN", "LUCK", "FALL",
        "HARD", "DUCK", "RICH", "SOUL", "VAST", "YARD"
    };

    public Easy() {
        this.attempts = 5;
        this.wordLength = 4;
    }

    @Override
    protected List<String> loadWords() {
        return Arrays.asList(WORDS_4);
    }
}