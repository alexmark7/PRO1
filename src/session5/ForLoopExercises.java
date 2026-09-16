void main() {
    //select exercise to run
    E5();

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


    for (int i = 1; i <= input; i++) { // Makes the rows of the rhombus
        for (int j = input; j > i; j--) {
            IO.print(" ");
    }
        for (int k = 1; k <= (2 * i - 1); k++) {
            IO.print("*");
        }
        IO.println();
    }

    }

//Exercise 6
void E6() {


}


//Exercise 7
void E7() {


}

//Exercise 8
void E8() {


}