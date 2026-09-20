void main() {
    //select exercise to run
    E8();

}

//Exercise 1 - Sum with Expanded Output
void E1() {

    int input = Integer.parseInt(IO.readln("Enter a number: "));

    int sum = 0;
    int counter = 1;
    for (int i = 0; i <= input; i++) {
        sum += i;
    }

    IO.print("The sum is (");

    for (counter = 1; counter <= input; counter++) {
        IO.print(counter);
        if (counter < input) {
            IO.print(" + ");
        }

    }

    IO.print("): " + sum);
}

//Exercise 2 - Print numbers with conditions
void E2() {

    int input = Integer.parseInt(IO.readln("Enter a number: "));

    String Buzz = "Buzz";
    String Fizz = "Fizz";

    for (int i = 1; i <= input; i++) {
        if (i % 3 == 0 && i % 5 == 0) {
            IO.println(Fizz + Buzz);
        } else if (i % 3 == 0) {
            IO.println(Fizz);
        } else if (i % 5 == 0) {
            IO.println(Buzz);
        } else {
            IO.println(i);
        }
    }


}

//Exercise 3 - Print even numbers
void E3() {

    int input = Integer.parseInt(IO.readln("Enter a number: "));

    for (int i = 0; i <= input; i++) {
        if (i % 2 == 0) {
            IO.println(i + " is even");
        } else {
            IO.println(i + " is odd");
        }
    }

}

//Exercise 4 - Print a triangle of asterisks
void E4() {

    int input = Integer.parseInt(IO.readln("Enter a number: "));

    for (int i = 0; i < input; i++) {

        IO.print("*");

        for (int j = 1; j <= i; j++) {
            IO.print("*");
        }
        IO.println();
    }
}

//Exercise 5 - Print a Rhombus of asterisks
void E5() {


    int input = Integer.parseInt(IO.readln("Enter a number: "));

    if (input % 2 == 0) {
        IO.println("Can't be an even number");
    } else {

        // Makes the rows of the rhombus top half
        for (int i = 1; i <= input / 2 + 1; i++) {

            // makes the spaces for the top half
            for (int j = input / 2 + 1; j > i; j--) {
                IO.print(" ");
            }
            // makes the stars for the top half
            for (int k = 1; k <= (i * 2) - 1; k++) {
                IO.print("*");
            }
            IO.println();
        }
        // Makes the rows of the rhombus bottom half
        for (int i = 1; i <= input / 2; i++) {

            // makes the spaces for the lower half
            for (int j = 1; j <= i; j++) {
                IO.print(" ");
            }
            // makes the stars for the lower half
            for (int k = 1; k <= input - (i * 2); k++)
                IO.print("*");

            IO.println();
        }
    }
}

//Exercise 6
void E6() {

    int input = Integer.parseInt(IO.readln("Enter a number: "));
    int oldNumber = 1;
    int newNumber = 0;

    for (int i = 0; i < input && input >= newNumber; i++) {
        IO.println(newNumber);
        newNumber = newNumber + oldNumber;
        oldNumber = newNumber - oldNumber;

    }
}


//Exercise 7
void E7() {

    String input = IO.readln("Enter a String: ").trim();

    for (int i = 0; i < input.length(); i++) {
        IO.print(input.charAt(input.length() - i - 1));
    }

}

//Exercise 8
void E8() {

    int input = 0;
    int sum = 0;

    int numbers = Integer.parseInt(IO.readln("How many number to enter?: "));

    for (int i = 0; i < numbers; i++) {
        input = Integer.parseInt(IO.readln("Enter number " + (i+1) + ": "));
        sum += input;
    }

    IO.println("The sum is:" + sum);

    double average = (double) sum;
    IO.println("The average is: " + (average/numbers));
}