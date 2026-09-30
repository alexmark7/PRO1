// Exercise 13 - Number guessing 2
void main() {

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