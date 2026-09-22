void main() throws IOException {

    printIntro();

    List<String> words = Files.readAllLines(Path.of("src", "Games", "hangman_words.txt")); //

    String difficulty = IO.readln("Choose difficulty: Easy, Medium or Hard: ").toLowerCase().trim();

    int minLength = 0;
    int maxLength = 50;
    int wrongGuesses = 0;
    int maxWrongGuesses = 6;
    int usedLetterCount = 0;

    // Sets the length of the word based on selected difficulty
    if (difficulty.equals("easy")) {
        minLength = 1;
        maxLength = 5;
    } else if (difficulty.equals("medium")) {
        minLength = 6;
        maxLength = 8;
    } else if (difficulty.equals("hard")) {
        minLength = 9;
    }

    // Picks the word from the list
    String randomWord = ""; // will become the word
    while (randomWord.length() < minLength || randomWord.length() > maxLength) {

        int randomIndex = (int) (Math.random() * words.size()); // Gets a random index of the Words lists by multiplying Math.Random by the size (amount of lines) in the .txt file

        randomWord = words.get(randomIndex).trim().toLowerCase();
    }

    IO.println("Difficulty: " + difficulty);
    // IO.println("The word was: " + randomWord); // to test if the word is generated correctly

    char[][] generatedWord = new char[2][randomWord.length()];
    char[] usedLetters = new char[20];
    char underscore = '_';

    //Generates the words in the first array
    for (int index = 0; index < randomWord.length(); index++) {
        generatedWord[0][index] = randomWord.charAt(index);
        // IO.print(generatedWord[0][index]); // to test printing array[0]
    }
    //Generates the underscores in the second array
    for (int index = 0; index < randomWord.length(); index++) {
        generatedWord[1][index] = underscore;
        // IO.print(generatedWord[1][index]); // to test printing array[1]
    }

    printHangman(wrongGuesses);

    for (int i = 0; i < randomWord.length(); i++) {
        IO.print(generatedWord[1][i] + " ");
    }
    IO.println();

    //The game logic
    while (wrongGuesses < maxWrongGuesses) {

        boolean alreadyUsed = false;
        boolean correctGuess = false;
        boolean won = true;

        char inputLetter = IO.readln("Please enter a letter: ").toLowerCase().charAt(0);

        // Check if the letter has already been used
        for (int i = 0; i < usedLetterCount; i++) {

            if (usedLetters[i] == inputLetter) {
                alreadyUsed = true;
            }
        }

        // If the letter was already used
        if (alreadyUsed) {
            IO.println("You already guessed that letter!");
        }
        // If the letter has NOT been used
        else {
            usedLetters[usedLetterCount] = inputLetter;usedLetterCount++;
            // Check if the letter is in the word
            for (int i = 0; i < randomWord.length(); i++) {
                if (randomWord.charAt(i) == inputLetter) {
                    generatedWord[1][i] = inputLetter;
                    correctGuess = true;
                }
            }
            // 4. Check if the guess was correct
            if (correctGuess) {
                IO.println("Correct!");
            } else {
                IO.println("Wrong!");
                wrongGuesses++;
                printHangman(wrongGuesses);
            }
        }
        //Prints current state of the word
        for (int i = 0; i < randomWord.length(); i++) {
            IO.print(generatedWord[1][i] + " ");
        }
        IO.println();

        //Check if the player has won
        for (int i = 0; i < randomWord.length(); i++) {
            if (generatedWord[1][i] == '_') {
                won = false;
            }
        }
        if (won) {
            printWin();
            IO.println("The word was: " + randomWord);
            break;
        }

        //Prints the current letters
        IO.print("Used letters: ");
        for (int i = 0; i < usedLetterCount; i++) {
            IO.print(usedLetters[i] + ", ");
        }
        IO.println();
    }
    IO.println("The word was: " + randomWord);
}


void printIntro() {

    IO.println("""
            
                    Welcome to HANGMAN!
            
                        +---+
                        |   |
                        O   |
                       /|\\  |
                       / \\  |
                            |
                        =========
                 Guess the word... or else.
            """);
}

void printWin(){
    IO.println("""
                    *************************************************
                    *                                               *
                    *              CONGRATULATIONS!                 *
                    *                                               *
                    *                  YOU Won!                     *
                    *                                               *
                    *************************************************
                    """);
}

void printHangman(int wrongGuesses) {

    String hangman = switch (wrongGuesses) {

        case 0 -> """
                
                    +---+
                    |   |
                        |
                        |
                        |
                        |
                    =========
                """;

        case 1 -> """
                
                    +---+
                    |   |
                    O   |
                        |
                        |
                        |
                    =========
                """;

        case 2 -> """
                
                    +---+
                    |   |
                    O   |
                    |   |
                        |
                        |
                    =========
                """;

        case 3 -> """
                
                     +---+
                     |   |
                     O   |
                    /|   |
                         |
                         |
                     =========
                """;

        case 4 -> """
                
                     +---+
                     |   |
                     O   |
                    /|\\  |
                         |
                         |
                     =========
                """;

        case 5 -> """
                
                     +---+
                     |   |
                     O   |
                    /|\\  |
                    /    |
                         |
                     =========
                """;

        default -> """
                
                     +---+
                     |   |
                     O   |
                    /|\\  |
                    / \\  |
                         |
                     =========
                
                 GAME OVER!
                """;
    };

    IO.println(hangman);
}