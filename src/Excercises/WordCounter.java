void main () {
    //select exercise to run
    E1();

}
//Exercise 1
void E1 () {

    String sentence = IO.readln("Enter Sentence: ");

    // Goal 1 is to count amount of characters in a sentence and 2 count the amount of words

    int length = sentence.length(); // Goal 1

    String trimmed = sentence.trim(); // Goal 2
    int wordCount = trimmed.split("\\s+").length;

    IO.println("Words: " + wordCount + "\nCharacters " + length);
}

//Exercise 2
void E2 () {



}
//Exercise 3
void E3 () {


}
//Exercise 4
void E4 () {


}