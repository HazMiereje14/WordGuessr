package main;
import java.util.*;

import main.subDifficulites.Easy;
import main.subDifficulites.Hard;
import main.subDifficulites.Medium;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int score = 0;

        while (true) {
            System.out.println("\nChoose difficulty:");
            System.out.println("1 = Easy (5 lives, 4-letter words)");
            System.out.println("2 = Normal (5 lives, 5-letter words)");
            System.out.println("3 = Hard (5 lives, 6-letter words)");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            Difficulty difficulty;

            switch (choice) {
                case 1: difficulty = new Easy(); break;
                case 2: difficulty = new Medium(); break;
                case 3: difficulty = new Hard(); break;
                default:
                    System.out.println("Invalid choice. Defaulting to Easy.");
                    difficulty = new Easy();
                    break;
            }

            difficulty.setup(rand);

            System.out.println("\nGuess the correct " + difficulty.getWordLength() + "-letter word.");
            System.out.println("Here are your possible words:\n");
            List<String> gridWords = difficulty.getGridWords();

            for (int i = 0; i < gridWords.size(); i++) {
                System.out.print(gridWords.get(i) + "\t");
                if ((i + 1) % 6 == 0) System.out.println();
            }
            System.out.println();

            int attemptsLeft = difficulty.getAttempts();
            boolean won = false;

            while (attemptsLeft > 0) {
                System.out.print("Enter your guess: ");
                String guess = scanner.nextLine().trim().toUpperCase();

                if (guess.length() != difficulty.getWordLength()) {
                    System.out.println("Please enter a " + difficulty.getWordLength() + "-letter word!");
                    continue;
                }

                StringBuilder feedback = new StringBuilder();
                for (int i = 0; i < difficulty.getWordLength(); i++) {
                    if (guess.charAt(i) == difficulty.getAnswer().charAt(i)) {
                        feedback.append('[').append(guess.charAt(i)).append(']');
                    } else {
                        feedback.append(guess.charAt(i));
                    }
                }

                System.out.println("Feedback: " + feedback);

                if (guess.equals(difficulty.getAnswer())) {
                    System.out.println("\nCongratulations! You guessed the correct word: " + difficulty.getAnswer());
                    won = true;
                    break;
                }

                attemptsLeft--;
                System.out.println("Lives left: " + attemptsLeft);
            }

            if (won) {
                int points = 0;
                switch (choice) {
                    case 1: points = 10; break;
                    case 2: points = 20; break;
                    case 3: points = 30; break;
                }
                score += points;
                System.out.println("You earned " + points + " points! Total score: " + score);
            } else {
                System.out.println("\nGame Over! The correct word was: " + difficulty.getAnswer());
                score = 0;
                System.out.println("Your score has been reset to 0.");
            }

            System.out.print("\nPlay again? (Y/N): ");
            String again = scanner.nextLine().trim().toUpperCase();
            if (!again.equals("Y")) {
                System.out.println("\nThanks for playing! Your final score: " + score);
                break;
            }
        }
        scanner.close();
    }
}
