void main () {
    //select exercise to run
    E3();

}
//Exercise 1
void E1 () {

    String word = IO.readln("Enter a word: ");
    String character = IO.readln("Enter a character: ");

    int index1 = word.indexOf(character);

    IO.println("The first occurrence of " + character + " is at: " + index1);

}

//Exercise 2
void E2 () {

    String word = IO.readln("Enter a word: ");
    String character = IO.readln("Enter a character: ");
    int startingPosition = Integer.parseInt(IO.readln("Enter the starting position: "));

    int index = word.indexOf(character, startingPosition);

    int relativeIndex = index - startingPosition;

    IO.println("The first occurrence of " + character + " after " + startingPosition + " is at index: "+ relativeIndex);


}
//Exercise 3
void E3 () {

    String word = IO.readln("Enter a word: ");
    String character = IO.readln("Enter a character: ");

    int index = word.indexOf(character); // index number of first character in a word. so 3 for programming

    String partialWord = word.substring(0,index);

    IO.println("The substring up to \'" + character + "\' is: " + partialWord);

}



