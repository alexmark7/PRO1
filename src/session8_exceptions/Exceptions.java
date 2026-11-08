void main () {
    //select exercise to run
    E1();

}
//Exercise 1
void E1 () {

    String input = IO.readln("Enter a word: ");

    IO.println("You entered: " + input);

}

//Exercise 2
void E2 () {



}
//Exercise 3
void E3 () {
    try {
        String input = IO.readln("Enter a number: ");
        int number = Integer.parseInt(input);
        IO.println("You entered: " + number);
        if (number > 10) {
            System.out.println("Number is greater than 10");
        } else {
            System.out.println("Number is less than or equal to 10");
        }
    } catch (NumberFormatException error) {
        System.out.println("Invalid number: " + error.getMessage());
    }

}
//Exercise 4
void E4 () {


}