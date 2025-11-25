package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public abstract class Difficulty {
    protected int attempts;
    protected int wordLength;
    protected List<String> words;
    protected String answer;

    public int getAttempts() {
        return attempts;
    }

    public int getWordLength() {
        return wordLength;
    }

    protected abstract List<String> loadWords();

    public void setup(Random rand) {
        words = new ArrayList<>(loadWords());
        Collections.shuffle(words);

        if (words.size() > 18)
            words = words.subList(0, 18);
        answer = words.get(rand.nextInt(words.size()));
    }

    public List<String> getGridWords() {
        return words;
    }

    public String getAnswer() {
        return answer;
    }
}