import java.util.Scanner;

void main() {

    Scanner userInput = new Scanner(System.in);

    IO.print("Enter a number: ");

    if (userInput.hasNextInt()) {
        int number = userInput.nextInt();

        if (number > 0) {
            IO.println("The number is positive.");
        } else if (number < 0) {
            IO.println("The number is negative.");
        } else {
            IO.println("The number is zero.");
        }
    } else {
        IO.println("Please enter a valid whole number.");
    }

    userInput.close();
}
