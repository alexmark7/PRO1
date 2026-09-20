void main() {
    //select exercise to run
    E13();

}

//Exercise 1
void E1() {

    int i = 1;
    // While loop executes until condition is false but only if the condition is initially true.
    while (i <= 5) {
        IO.println(i);
        i++;

    }

    boolean keepGoing = true;


    while (keepGoing) {
        String input = IO.readln("Please enter 'Hello World': ");

        if (input.equals("Hello World")) {
            keepGoing = false;
        } else {
            IO.println("Incorrect input, Please try again.");
        }
    }
    IO.println("Succes! You entered 'Hello World'.");
}

//Exercise 2
void E2() {

    Boolean keepGoing = true;
    int total = 0;

    while (keepGoing) {

        String input = IO.readln("Please enter a number: ");

        if (input.equals("x")) {
            IO.println("The total sum is: " + total);
            keepGoing = false;

        } else {
            int number = Integer.parseInt(input);
            total = total + number;
        }

    }

    // Do-while loop executes once no matter if true or false but if it returns false, then it moves on.


}

//Exercise 3
void E3() {


}

//Exercise 4 - Number guessing game.
void E4() {

    int randomNumber = (int) (Math.random() * 10) + 1; // Generate a random number between 1 and 10

    while (true) {

        int input = Integer.parseInt(IO.readln("Please enter a number between 1 and 10: "));

        if (randomNumber == input) {
            IO.println("YOU GOT IT! The number was:" + randomNumber);
            break;
        } else if (randomNumber < input && input <= 10) {
            IO.println("Too high try again");
        } else if (randomNumber > input && input > 0) {
            IO.println("Too low try again");
        } else {
            IO.println("Incorrect input, Please try again.");
        }

    }

}

//Exercise 5 - Calculate Factorials
void E5() {

    int total = 1;
    int number = Integer.parseInt(IO.readln("Please enter a number: "));
    int number1 = number;

    while (number > 0) {
        total = total * number;
        number--;
    }

    IO.println("The factorial of " + number1 + " is: " + total);
}

//Exercise 6 - Password Attempts limit.
void E6() {

    int attempts = 1;

    while (true) {

        String password = IO.readln("Please enter your password: ").trim();

        if (password.equals("password")) {
            IO.println("Access granted!");
            break;
        } else if (attempts == 3) {
            IO.println("Password has Limit reached! Locking you out!");
            break;
        } else {
            IO.println("Incorrect password, please try again. (Attempt" + attempts + "/3):");
            attempts++;

        }

    }

}

//Exercise 7 - Sum until below -10
void E7() {

    int total = 0;


    while (total > -10) {

        int number = Integer.parseInt(IO.readln("Please enter a number: "));
        int number1 = number;

        total = total + number;
        IO.println("Current sum:" + total);
        number--;
    }

    IO.println("The Sum har dropped below -10. Stopping");
    IO.println("Final Sum = " + total);
}

//Exercise 8 -
void E8() {
    IO.println("Odd number from 1 to 10");

    for (int i = 1; i <= 10; i++) {
        if (i % 2 == 0) {
            continue;
        }
        IO.println(i);

    }
    IO.println("Done!");

}

//Exercise 9 - Print a Number Pyramid
void E9() {

    int height = Integer.parseInt(IO.readln("Enter the height of the pyramid: "));

    int row = 1;

    while (row <= height) {

        int number = 1;

        while (number <= row) {
            IO.print(number);
            number++;
        }

        IO.println();
        row++;
    }

}

//Exercise 10 - Interactive multiplication table
void E10() {

    int firstNumber = Integer.parseInt(IO.readln("Enter a number: "));
    int secondNumber = Integer.parseInt(IO.readln("Enter a number: "));
    int thirdNumber = Integer.parseInt(IO.readln("Enter a number: "));
    int i = 1;

    IO.println();
    IO.println("Multiplication talbe for: " + firstNumber);
    while (i <= 10) {

        if (firstNumber == 0) {
            break;
        }
        IO.println(firstNumber + " x " + i + " = " + (firstNumber * i));
        i++;
    }

    IO.println();
    IO.println("Multiplication talbe for: " + secondNumber);
    i = 1;

    while (i <= 10) {
        if (secondNumber == 0) {
            break;
        }
        IO.println(secondNumber + " x " + i + " = " + (secondNumber * i));
        i++;


    }

    IO.println();
    IO.println("Multiplication talbe for: " + thirdNumber);
    i = 1;

    while (i <= 10) {
        if (thirdNumber == 0) {
            break;
        }
        IO.println(thirdNumber + " x " + i + " = " + (thirdNumber * i));
        i++;

    }

}

//Exercise 11 - Let the computer guess a number
void E11() {

    int min = 1;
    int max = 1000;
    int randomNumber = Integer.parseInt(IO.readln("Please enter a number between 1-1000: ")); //let's just say 250
    int guessCounter = 0;

    while (true) {

        int computerGuess = (int) (Math.random() * (max - min + 1)) + min;

        IO.println(computerGuess); //let just say 500

        String result = IO.readln("Is the guess correct? (yes/no): ");
        if (result.equals("yes")) {
            IO.println("The computer guessed correctly! It guessed it in: " + guessCounter + " guesses!");
            break;
        } else if (result.equals("no")) {
            String lowHigh = IO.readln("Was the number too high or low? (low/high): ");

            if (lowHigh.equals("high")) {
                max = computerGuess - 1;

            } else if (lowHigh.equals("low")) {
                min = computerGuess + 1;

            }
        }
        guessCounter++;
    }

}

//Exercise 12 - Calculator
void E12() {

    while (true) {

        int firstNumber = Integer.parseInt(IO.readln("Please first number: "));
        String operator = IO.readln("Please type operator: ");
        int secondNumber = Integer.parseInt(IO.readln("Please second number: "));

        while (true) {

            if (operator.equals("+")) {
                IO.println(firstNumber + secondNumber);
                break;
            } else if (operator.equals("-")) {
                IO.println(firstNumber - secondNumber);
                break;
            } else if (operator.equals("*")) {
                IO.println(firstNumber * secondNumber);
                break;
            } else if (operator.equals("/") && secondNumber == 0 || firstNumber == 0) {
                IO.print("Invalid Input. \t");
                break;
            } else if (operator.equals("/")) {
                IO.println(firstNumber / secondNumber);
                break;
            } else {
                IO.println("Incorrect input, please try again.");
                break;
            }
        }
    }
}

// Exercise 13 - Number guessing 2
void E13() {

    int min = 1;
    int max = 1000;
    int randomNumber = Integer.parseInt(IO.readln("Please enter a number between 1-1000: ")); //let's just say 250
    int computerNumber = (int) (Math.random() * (1000 + 1));
    int guessCounter = 0;

    while (true) {

        //Computer Guess
        int computerGuess = (int) (Math.random() * (max - min + 1)) + min;
        IO.println("My guess is: " + computerGuess); //let just say 500

        if (computerGuess == randomNumber) {
            IO.println("The computer guessed correctly! It guessed it in: " + guessCounter + " guesses!");
            IO.println("My number was: " + computerNumber);
            break;
        } else {
            if (randomNumber < computerGuess) {
                max = computerGuess - 1;
            } else {
                min = computerGuess + 1;
            }
        }

        //My guess
        int myGuess = Integer.parseInt(IO.readln("Please enter your guess between 1-1000: "));

        if (computerNumber == myGuess) {
            IO.println("You guessed it  correctly! You guessed it in: " + guessCounter + " guesses!");
            break;
        } else if (computerNumber > myGuess) {
            IO.println("It's higher");
        } else {
            IO.println("It's lower");
        }
        guessCounter++;
    }

}

//Exercise 14 -
void E14() {

    while (true) {

        int endGame = 0;
        int round = 1;
        int computerScore = 0;
        int playerScore = 0;

        while (true) {

            String choice = IO.readln("Enter your choice (rock, paper, scissors): ").trim().toLowerCase();

            int roll = (int) (Math.random() * 3) + 1;

            String computerChoice = switch (roll) {
                case 1 -> "rock";
                case 2 -> "paper";
                case 3 -> "scissors";
                default -> "Unknown choice";
            };

            String result = switch (choice) {
                case "rock" -> "You chose rock.";
                case "paper" -> "You chose paper.";
                case "scissors" -> "You chose scissors.";
                default -> "Invalid choice";
            };
            IO.println("Round " + round + ": ");
            IO.println(result);
            IO.println("Computer chose: " + computerChoice);

            if (result.equals("Invalid choice")) {
                IO.println("Please enter a valid choice.");
                break;
            } else if (computerChoice.equals(choice)) {
                IO.println("It's a tie! The computer also chose " + computerChoice + ".");
                round++;
            } else if ((computerChoice.equals("rock") && choice.equals("scissors"))
                    || (computerChoice.equals("paper") && choice.equals("rock"))
                    || (computerChoice.equals("scissors") && choice.equals("paper"))) {
                IO.println("You lose this round!");
                computerScore++;
                round++;
            } else {
                IO.println("You win this round!");
                playerScore++;
                round++;
            }
            IO.println();
            IO.println("Score: You " + playerScore + " - " + computerScore + " Computer");

            if (playerScore == 2 || computerScore == 2) {

            if (playerScore > computerScore) {
                IO.println("CONGRATULATIONS! You won the match!");
            } else if (playerScore < computerScore) {
                IO.println("You lost the match.");
            }

            String playAgain = IO.readln("Play again? (y/n)");
            if (playAgain.equals("y")) {
                break;
            } else if (playAgain.equals("n")) {
                endGame++;
                break;
            }
            }
        }
        if (endGame == 1) {
            break;
        }
    }
}

void E15 () {

    int userInput = Integer.parseInt(IO.readln("Enter how many terms of Pi should be calculated: "));
    int i = 1;
    double total = 0;

    while (i <= userInput) {

        double estimate = (double) 1 / (2*i-1);

        if (i % 2 == 0) {
            total = total - estimate;
        } else if (i % 2 == 1) {
            total += estimate;
        }
        i++;

    }
    double termTotal = 4*total;

    IO.println("Estimated PI using " + userInput + " terms: " + termTotal);
    double actualPI = Math.PI;
    IO.println(actualPI);
    IO.println("Difference: " + (actualPI - termTotal));
}