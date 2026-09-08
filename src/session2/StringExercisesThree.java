void main () {
    //select exercise to run
    E3();

}
//Exercise 1
void E1 () {

    String sentence = IO.readln("Enter your sentence: ");
    String word = IO.readln("Enter your word: ");
    boolean contains = sentence.contains(word);
    IO.println("The sentence contains the following word: " + contains);

}

//Exercise 2
void E2 () {

    String sentence = IO.readln("Enter your sentence: ");
    String word = IO.readln("Enter your word: ");

    String sentenceLowerCase = sentence.toLowerCase();
    String wordLowerCase = word.toLowerCase();

    boolean contains = sentenceLowerCase.contains(wordLowerCase);

    IO.println("The sentence contains the following word: " + contains);

}
//Exercise 3
void E3 () {

    String sentence = IO.readln("Enter your sentence: ");
    String startWord = IO.readln("Enter a start-word: ");
    String endWord = IO.readln("Enter your an end-word: ");

    boolean startsWith = sentence.startsWith(startWord);
    boolean endsWith = sentence.endsWith(endWord);
    boolean check = startsWith && endsWith;

    IO.println("The sentence is surrounded: " + check);

}
//Exercise 4
void E4 () {

    String word = IO.readln("Enter a word: ");
    String character = IO.readln("Enter a character: ");

    int index = word.indexOf(character);

    IO.println("The first occurence of \'" + character + "\' is: " + index );
}