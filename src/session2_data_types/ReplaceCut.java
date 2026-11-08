void main () {
    //select exercise to run
    E4();

}
//Exercise 1
void E1 () {

    String word = IO.readln("Enter your word: ");

    String oldChar = IO.readln("Enter the character to replace: ");

    String newChar = IO.readln("Enter the new character: ");

    String newWord = word.replace(oldChar,newChar);

    IO.println("Result: " + newWord);
}

//Exercise 2
void E2 () {


    String sentence = IO.readln("Enter your sentence: ");

    String newWord = sentence.replace(" ","");

    IO.println("Result: " + newWord);
}
//Exercise 3
void E3 () {

    String sentence = IO.readln("Enter your sentence: ");

    String trimmedSentence = sentence.replaceAll(" +"," ");

    IO.println("Result: " + trimmedSentence);
}
//Exercise 4
void E4 () {

    String word = IO.readln("Enter your first word: ");
    String word2 = IO.readln("Enter your second word: ");

    String trimmedWord = word.trim();
    String trimmedWord2 = word2.trim();

    boolean equals = trimmedWord.equals(trimmedWord2);

    IO.println("Result: " + equals);


}