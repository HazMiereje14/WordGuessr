# WordGuessr: Word Guessing Game

## Description/Overview
**WordGuessr** is a retro-style word guessing game made with Java, inspired by classic console interfaces. The player must uncover the correct hidden word from a list of possible codes displayed on screen. By typing letters into the console, the program highlights correct letters that match the target word. Each successful guess earns the player a point, encouraging observation and logic. The minimalistic terminal aesthetic and hexadecimal-style layout give the game a nostalgic hacking simulation feel.

**Problem it solves:** This project demonstrate a simple word guessing game is created with the use of OOP principles, sharpening thinking skills and imagination.

## OOP Concepts Applied:
- **Encapsulation:** `Difficulties` abstract class defines the common interface for different difficulties.
- **Inheritance:** `Easy`, `Medium`, `Hard` extend `Difficulties`, specifying their own word data and parameters.
- **Polymorphism:** Word lists, attempts, word length, and answer are encapsulated inside `Difficulties` subclasses, accessed via getters.
- **Abstraction:** The main class uses a `Difficulties` reference, dynamically invoking subclass methods (`loadWords`, getters) without knowing exact type.

## Program Structure

- **App:** Handles user input, validating guesses, and provides feedback by indicating letters in the correct position.
- **Abstract Class Difficulty:** This is the blueprint for all difficulty levels. It encapsulates the common data and behaviors needed for a difficulty:
  - Private/protected fields for attempts, word length, the list of words, and the answer.
  - Abstract method `loadWords()` that each subclass implements to provide its own word list.
  - A `setup()` method that initializes the shuffled word list and picks a random answer.
  - Getters for encapsulated fields allow controlled access to attempts, word length, and the answer.
- **Subclasses `Easy`,`Medium`, `Hard`:** Each inherits from Difficulty and:
  -Implements `loadWords()` to supply its specific word set.
  -Specifies attempts and word length uniquely in their constructors.
- **Relationships:**  
  - Interacts with a `Difficulty` reference, allowing polymorphic behavior dependent on user choice.
 
**Text-Based Class Diagram:**
```
MainApp
 │
Difficulty (abstract)
 ├── SubDiff (abstract)
     ├── Easy
     ├── Medium
     └── Hard
```


## How to Run the Program

1. **Steps to Compile the Java source files.**
   - Make sure your working directory contains the `main` and `main.subDifficulty` packages.
   - Run:
     ```
     javac main/*.java main/subDifficulites/*.java
     ```
2. **Run the application:**
   - Execute the main class:
     ```
    java main.App
     ```
   - Follow on-screen prompts to select your desired difficulty and play.

##Sample Output

```
Choose difficulty:
1 = Easy (5 lives, 4-letter words)
2 = Normal (5 lives, 5-letter words)
3 = Hard (5 lives, 6-letter words)
Enter choice: 3

Guess the correct 6-letter word.
Here are your possible words:

HANDLE  GARDEN  DOCTOR  ORANGE  SUMMER  DANGER
FAMILY  FRIDAY  NUMBER  FLOWER  JUNGLE  MOTHER
CAMERA  LETTER  ISLAND  COFFEE  UNIQUE  MARKET

Enter your guess: Friday
Feedback: F[R]IDAY
Lives left: 4     
Enter your guess: orange
Feedback: [O][R][A][N][G][E]

Congratulations! You guessed the correct word: ORANGE
You earned 30 points! Total score: 30

Play again? (Y/N): y

Choose difficulty:
1 = Easy (5 lives, 4-letter words)
2 = Normal (5 lives, 5-letter words)
3 = Hard (5 lives, 6-letter words)
Enter choice: 3

Guess the correct 6-letter word.
Here are your possible words:

GARDEN  SUMMER  PALACE  MARKET  LADDER  CREDIT
ORANGE  CIRCLE  MOTHER  PLANET  COUPLE  FAMILY
DANGER  RABBIT  FRIDAY  JUNGLE  LETTER  COFFEE

Enter your guess: garden
Feedback: GARD[E]N
Lives left: 4
Enter your guess: mother
Feedback: MOTH[E]R
Lives left: 3
Enter your guess: market
Feedback: MARK[E][T]
Lives left: 2
Enter your guess: planet
Feedback: [P][L][A][N][E][T]

Congratulations! You guessed the correct word: PLANET
You earned 30 points! Total score: 60

Play again? (Y/N): y

Choose difficulty:
1 = Easy (5 lives, 4-letter words)
2 = Normal (5 lives, 5-letter words)
3 = Hard (5 lives, 6-letter words)
Enter choice: 3

Guess the correct 6-letter word.
Here are your possible words:

COTTON  COUPLE  RABBIT  CASTLE  MARKET  SUMMER
CAMERA  HANDLE  FRIDAY  PLANET  ISLAND  LETTER
FLOWER  VELVET  GARDEN  CREDIT  WINDOW  UNIQUE

Enter your guess: cotton
Feedback: COTTON
Lives left: 4
Enter your guess: island
Feedback: ISLAND
Lives left: 3
Enter your guess: unique
Feedback: UNIQUE
Lives left: 2
Enter your guess: summer
Feedback: SUMMER
Lives left: 1
Enter your guess: rabbit
Feedback: [R][A][B][B][I][T]

Congratulations! You guessed the correct word: RABBIT
You earned 30 points! Total score: 90

Play again? (Y/N): y   

Choose difficulty:
1 = Easy (5 lives, 4-letter words)
2 = Normal (5 lives, 5-letter words)
3 = Hard (5 lives, 6-letter words)
Enter choice: 3

Guess the correct 6-letter word.
Here are your possible words:

CREDIT  GARDEN  ISLAND  WINDOW  COTTON  LADDER
PLANET  FRIDAY  COUPLE  MARKET  VELVET  ORANGE
COFFEE  CASTLE  UNIQUE  DANGER  RABBIT  PALACE

Enter your guess: credit
Feedback: C[R]E[D]IT
Lives left: 4
Enter your guess: friday
Feedback: [F][R][I][D][A][Y]

Congratulations! You guessed the correct word: FRIDAY
You earned 30 points! Total score: 120

Play again? (Y/N): n

Thanks for playing! Your final score: 120

```

##Authors and Acknowledgement:

**Authors:**
- *Hariz Jeremie C. Garcia*
(*24-06295@g.batstate-u.edu.ph*)
- *Cxyanel Adriane D. Evangelist*
(*24-03563@g.batstate-u.edu.ph*)
- *Ahlson Jared Giovanni E. Magboo*
(*24-09166@g.batstate-u.edu.ph*)
- *John Andrew C. Sanchez*
(*24-06902@g.batstate-u.edu.ph*)

**Acknowledgements:**  
- Thanks to our Instructor for guidance and materials provided.
- Appreciation to our members for the efforts they have put in this project.
- Online tutorials provided by Youtube videos and the help of AI's.

## References

- OOP Concepts Overview : [Programiz](https://www.programiz.com/java-programming/object-oriented-programming)
- Sample tutorials : [Programiz](https://www.programiz.com/java-programming/object-oriented-programming)
- Youtube Tutorial/s : [YouTube Video](https://youtu.be/Bua6LQO2vQ8?si=HUJ6nU6tOw2ap2Ew)
- AI's : [ChatGPT](https://chatgpt.com/)

---
